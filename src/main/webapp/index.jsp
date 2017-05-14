<%@ page import="com.enigio.tbf.DataTruck" %>
<%@ page import="com.enigio.tbf.Feeder" %>
<%@ page import="com.mashape.unirest.http.JsonNode" %>
<%@ page import="com.mashape.unirest.http.HttpResponse" %>
<%@ page import="java.util.ArrayList" %>

<%

    if(session.getAttribute("feeders") == null) {
        DataTruck.run();
        session.setAttribute("feeders", DataTruck.feeders);
    } else {
        //session variable already exists!
    }
   
%>

<!DOCTYPE HTML>

<html>

    <head>

        <meta charset="UTF-8">

        <!-- If IE use the latest rendering engine -->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <!-- Set the page to the width of the device and set the zoom level -->
        <meta name="viewport" content="width = device-width, initial-scale = 1">
        
        <title>DataTruck</title>
        
        <!-- Bootstrap Script Requirements -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <!-- Font Links -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Oswald" rel="stylesheet">
        
        <!-- Our CSS -->
        <style>
            
            footer {
                
                color: #fff;
                width: 100%;
                text-align: center;
                background-color: #204060;
                font-size: 12px;
                font-family: "Open Sans", Arial;
                padding: 5px;
            }
    
            
            .page-header h1, .page-header h2, .page-header h3, .page-header h4, .page-header h5   {
               
                font-family: "Oswald";
                
            }
            
            .page-header {
            
                border-bottom: none;
                margin-bottom: 0px;
                
            }
            
            .btn-primary {
                
                background-color: #204060;
                border: 1px solid #19334d;

            }
            
            h1, h2, h3, h4, h5 {
                
                font-family: "Open Sans";
                
            }
            
            #pageHeader {
                
                color: #fff;
                background-color: #204060;
                
            }
            
            #icons {
                
                color: #204060;
                
            }
            
            #icons h1 {
                
                text-align:center;
                font-size: 30px;
            }
            
            #icons h4 {
                
                font-family: "Oswald", Helvetica;
                text-align:center;
                color: #000;
                font-size: 16px;
                
            }
            
        </style>
        
        <!-- Our Scripts -->
        <script>
            
            // JSON Button Selection Script.
            $(document).ready(function(){
               
                var clickCheck = 0;
                
                /**
                * Shows and hides the "allJson" div. Changes button text.
                **/
                $("#toggleJson").click(function(){
                
                    $(".allJson").toggleClass("hidden");
                    
                    if (!clickCheck) {
                        
                        $("#viewJsonBtn").text("Show Table");
                        clickCheck = 1;
                        
                    } else {
                        
                        $("#viewJsonBtn").text("View Raw JSON");
                        clickCheck = 0;
                        
                    }
                
                }) 
                
                /**
                * Toggle "active" class on all primary buttons.
                **/
                $(".btn-primary").click(function(){
                
                    $(".btn-primary").removeClass("active");
                
                }) 
                
                //Hiding all JSON containers.
                $(".allJsonContainers").hide();
                
                //Showing active:
                $("#showingJson").show();
                
                /**
                * Showing and hiding individual JSON divs connected to their buttons.
                **/
                $(".allJsonButtons").click(function(){
                    
                    $(".allJsonContainers").hide();
                    $("."+this.name).fadeIn();
                
                }) 

                /**
                * Shows and hides the "addDataContainer" div. Changes button text.
                **/
                $("#addDataBtn").click(function(){
                
                    $("#addDataContainer").toggleClass("hidden");
                    
                    if (!clickCheck) {
                        
                        $("#addDataBtnTxt").text("Hide Data Adder");
                        clickCheck = 1;
                        
                    } else {
                        
                        $("#addDataBtnTxt").text("Add Data");
                        clickCheck = 0;
                        
                    }
                
                }) 
                
                
            });
        
        </script>
        
    </head>
    
    <body>
            
        <div id="pageHeader">
            
            <div class="container">

                <div class="page-header" style="text-align: center;">

                    <h1> DataTruck <br><small style="color: #fff;">Display info from the Currency Exchange Market.</small></h1>

                </div>

            </div>
            
        </div>
        
        <div class="container">
        
            <div class="row">
                
                <!-- Home Icons -->
                <div id="icons" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    
                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                        
                        <h1 style="text-align:center;">
                            <span class="glyphicon glyphicon-search"></span> <br> 
                            <h4>Inspect</h4>
                        </h1>
                        
                    </div>
                    
                    <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1">
                    </div>
                    
                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                        
                        <h1>
                            <span class="glyphicon glyphicon-stats"></span>
                            <h4>Graph</h4>
                        </h1>
                        
                    </div>
                    
                    <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1">
                    </div>
                    
                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                        
                        <h1>
                            <span class="glyphicon glyphicon-eye-open"></span>
                            <h4>Analyze</h4>
                        </h1>
                        
                    </div>
                    
                    <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1"></div>
                    
                </div>
                
            </div>
            
        </div>    
        
        <div class="container">
        
            <div class="row jumbotron">
                
                <!-- DUMMY ELEMENT -->
                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4"></div>
                
                <!-- Add Data -->
                <div class="col-lg-7 col-md-7 col-sm-7 col-xs-7">

                    <form action="" method="post">
                        <input type="hidden" name="deleteConfirmed" value="test">
                        <button type="submit" style="margin-left: 5px;"class="btn btn-sm btn-danger pull-right" role="button">
                        <b id="viewJsonBtn" style="font-weight: 500;">Delete All Data</b>
                    </button>

                    </form>

                    <% if(request.getAttribute("deleteConfirmed") != null) {
                        session.setAttribute("feeders", DataTruck.feeders);
                        DataTruck.feeders = new ArrayList<Feeder>();

                    }%>
                    
                    <button id="toggleJson" style="margin-left: 5px;" type="button" class="btn btn-sm btn-primary pull-right" role="button">
                        <b id="viewJsonBtn" style="font-weight: 500;">View Raw JSON</b>
                    </button>
                    
                    <button id="addDataBtn" type="button" class="btn btn-sm btn-primary pull-right" role="button">
                        <span class="glyphicon glyphicon-plus"></span> &nbsp; <b id="addDataBtnTxt" style="font-weight: 500;">Add Data</b>
                    </button>
                    
                </div>
                
                <!-- DUMMY ELEMENT -->
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2"></div>
                
                <br>
                <br>
                
                <!-- Popup: Manage Data -->
                <div id="addDataContainer" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 hidden">
                
                    <!-- You can constrain the columns if you want -->
                    <div class="row well">
                        
                        <h4 style="text-align: center;"> Please specify the following details of your data: </h4>
                        
                        <br>
                        
                        <form action="/" method="post">
                        
                            <div class="input-group input-group-md">

                                <span class="input-group-addon"> Name of Data </span>
                                <input name="dataName" type="text" class="form-control" placeholder="e.g. ManchesterVsLiverpool, BitcoinData, WeatherInSpain, etc">

                            </div>

                            <br>

                            <div class="input-group input-group-md">

                                <span class="input-group-addon"> API Link </span>
                                <input name="apiLink" type="text" class="form-control" placeholder="e.g. http://api.fixer.io/latest">

                            </div>

                            <br>

                            <!-- DUMMY ELEMENT -->
                            <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5"></div>

                            <div class="col-lg-2 col-md-2 col-sm-2 col-xs-2">

                                <button type="submit" class="btn btn-md btn-primary">

                                    <span class="glyphicon glyphicon-plus"></span> 
                                    Add This Data 

                                </button>

                            </div>
                            
                        </form>
                        
                        
                        <!-- JAVA FORM HANDLER -->
                        <jsp:useBean id="DataTruck" scope="page" class="com.enigio.tbf.DataTruck" />

                        <%
                           
                           if  ( request.getParameter("dataName") != null && request.getParameter("apiLink") != null ) {
                           
                                String name = request.getParameter("dataName");
                                String link = request.getParameter("apiLink");
                           
                               ((ArrayList<Feeder>)session.getAttribute("feeders")).add(new Feeder(name,link));
                           }
                           
                        %>
                        
                        
                        <!-- DUMMY ELEMENT -->
                        <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5"></div>
                    
                    </div>
                    
                </div>
            
                <!-- TABLE: Data Numbers -->
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 allJson">
                
                    <!-- You can constrain the columns if you want -->
                    <div class="row">

                        <!-- DUMMY ELEMENT -->
                        <div class="col-lg-1 col-md-1 col-sm-1 col-xs-0"></div>
                        
                        <div class="col-lg-10 col-md-10 col-sm-10">

                            <!-- 

                                The table class adds nice spacing and the other classes add additional style:

                                table-striped           - Variate the color for every other <td>
                                table-border            - Add a border to the table.
                                table-hover             - Change color when hovering a <td> 

                            -->
                            <%
                                ArrayList<Feeder> list = ((ArrayList<Feeder>)session.getAttribute("feeders"));

                            for (int i = 0; i < list.size() ; i++) {
                                int jsonArrSize = list.get(i).htmlJsonArray.length-2;
                                if ( i == 0 ) {
                            
                            %>
                            
                                <table id="showingJson" class="<%=list.get(i).nameOfFeeder%> table table-bordered table-striped table-hover allJsonContainers">

                                    <thead>
                                        <tr>
                                        <td colspan="2">Exchange Rates, Updated <%=list.get(i).htmlJsonArray[1]%></td>
                                        </tr>
                                    </thead>

                                    <tbody>

                                        <tr>

                                            <!-- You can adjust the width of table columns as well -->
                                            <th class="col-md-2"></th>

                                            <!-- Use text alignment like text-center or text-right -->
                                            <th class="text-center">
                                                <%=list.get(i).htmlJsonArray[list.get(i).htmlJsonArray.length-1]%>
                                            </th>

                                        </tr>
                                        
                                        <% 
                                           
                                           for (int j = 3; j < jsonArrSize; j++) { 
                                        
                                            if ( j%2 != 0) {
                                        %>
                                        
                                        <tr>
                                            <td>
                                                
                                                <a href="https://www.google.se/search?q=<%=list.get(i).htmlJsonArray[i]%>+Currency">
                                                    
                                                    <%=list.get(i).htmlJsonArray[j]%>
                                                        
                                                </a>
                                                    
                                            </td>  
                                        <% 
                                           } else  {
                                           
                                           %>        
                                                
                                            <td><%=list.get(i).htmlJsonArray[j]%></td>
                                        </tr>
                                                
                                        <% 
                                           
                                           } 
                                           
                                        }
                                           
                                        %>

                                    </tbody>

                                </table>

                            <%
                               } else { %>
                               

                                <table class="<%=list.get(i).nameOfFeeder%> table table-bordered table-striped table-hover allJsonContainers">

                                    <thead>
                                        <tr>
                                        <td colspan="2">Exchange Rates, Updated <%=list.get(i).htmlJsonArray[1]%></td>
                                        </tr>
                                    </thead>

                                    <tbody>

                                        <tr>

                                            <!-- You can adjust the width of table columns as well -->
                                            <th class="col-md-2"></th>

                                            <!-- Use text alignment like text-center or text-right -->
                                            <th class="text-center">
                                                <%=list.get(i).htmlJsonArray[list.get(i).htmlJsonArray.length-1]%>
                                            </th>

                                        </tr>
                                        
                                        <% 
                                           for (int j = 3; j < jsonArrSize; j++) { 
                                        
                                            if ( j%2 != 0) {
                                        %>
                                        
                                        <tr>
                                            <td>
                                                
                                                <a href="https://www.google.se/search?q=<%=list.get(i).htmlJsonArray[i]%>+Currency">
                                                    
                                                    <%=list.get(i).htmlJsonArray[j]%>
                                                        
                                                </a>
                                                    
                                            </td>  
                                        <% 
                                           } else  {
                                           
                                           %>        
                                                
                                            <td><%=list.get(i).htmlJsonArray[j]%></td>
                                        </tr>
                                                
                                        <% 
                                           
                                           } 
                                           
                                        }
                                           
                                        %>

                                    </tbody>

                                </table>
                                
                                <%
                               }
                                            
                            }
                            
                            %>
                            
                        </div>
                        
                        <!-- DUMMY ELEMENT -->
                        <div class="col-lg-1 col-md-1 col-sm-1 col-xs-0"></div>
                        
                    </div>
                    
                </div>
                    
                <!-- SHOWING: Raw JSON Container -->    
                <div class="container allJson hidden">
                
                    <div class="row">
                    
                        <!-- DUMMY ELEMENT -->
                        <div class="col-lg-1 col-md-1 col-sm-1 col-xs-0"></div>
                        
                        <!-- JSON Displayer -->
                        <div id="jsonLoopDisplayer" class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
                        
                            <%
                              
                               for (int i = 0; i < list.size(); i++ ){
                            
                                    if( i == 0 ) {
                            
                                       %><div id="showingJson" class="<%=list.get(i).nameOfFeeder%> well allJsonContainers">
                                        <%=list.get(i).prettyJsonString%>
                                            </div><%
                                                 
                                    } else {
                                                 
                                        %><div class="<%=list.get(i).nameOfFeeder%> well allJsonContainers">
                                        <%=list.get(i).prettyJsonString%>
                                            </div><%
                                            
                                    }
                                    
                            
                                }
                               
                            %>
                        
                        </div>
                        
                        <!-- DUMMY ELEMENT -->
                        <div class="col-lg-1 col-md-1 col-sm-1 col-xs-0"></div>
                        
                    </div>
                    
                </div>
                
                <!-- DUMMY ELEMENT -->
                <div class="col-lg-3 col-md-2 col-sm-1 col-xs-0"></div>
                
                <!-- Button Holder -->
                <div class="col-lg-6 col-md-8 col-sm-10 col-xs-6">

                    <!-- Button Group! -->
                    <div class="btn-group btn-group-sm" role="group">

                        
                        <%
                               for (int i = 0; i < list.size(); i++ ){
                            
                                   %><button type="button" name="<%=list.get(i).nameOfFeeder%>" class="btn btn-primary allJsonButtons" role="button">
                                    <%=list.get(i).nameOfFeeder%>
                                    </button><%
                            
                                }
                               
                        %>

                    </div>
                
                </div>
                
                <!-- DUMMY ELEMENT -->
                <div class="col-lg-3 col-md-2 col-sm-1 col-xs-0"></div>
            
            </div>
        
        </div>
        

        <footer>
            
            	&copy; Copyright Mattias Bergstrom &amp; Love Almgren 2017
        
        </footer>
        
    </body>


</html>

