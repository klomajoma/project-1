<%@ page import="com.enigio.tbf.DataTruck" %>
<%@ page import="com.mashape.unirest.http.JsonNode" %>
<%@ page import="com.mashape.unirest.http.HttpResponse" %>
<%DataTruck.run();%>
<%
   
        //Global Variables:
   
        //Formatting JSON Data as Strings.
        String b = DataTruck.feeders.get(0).getJsonResponse().getBody().getObject().toString().replaceAll("[{}\"]","");
        String c = DataTruck.feeders.get(1).getJsonResponse().getBody().getObject().toString().replaceAll("[{}\"]","");
        String d = DataTruck.feeders.get(2).getJsonResponse().getBody().getObject().toString().replaceAll("[{}\"]","");
                                                                                                  
        String[] sArr = b.split("[,:\"]"); //Creating string array containing data...
        String[] sArr2 = c.split("[,:\"]"); //Creating string array containing data...
        String[] sArr3 = d.split("[,:\"]"); //Creating string array containing data... 
        
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
            
            // Button Selection Script.
            $(document).ready(function(){
                
                $(".btn-primary").click(function(){
                
                    $(".btn-primary").removeClass("active");
                
                }) 
                
            });
        
        </script>
        
    </head>
    
    <body>
        

        <div id="pageHeader">
            
            <div class="container">

                <div class="page-header" style="text-align: center;">

                    <h1> DataTruck <br><small style="color: #fff;">Display info from the stock market, football games or the weather.</small></h1>

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
                <div class="col-lg-7 col-md-7 col-sm-5 col-xs-4"></div>
                
                <!-- Add Data -->
                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-8">
                
                    <button style="margin-left: 5px;" type="button" class="btn btn-sm btn-primary pull-right" role="button">
                        View Raw JSON
                    </button>
                    
                    <button type="button" class="btn btn-sm btn-primary pull-right" role="button">
                        <span class="glyphicon glyphicon-plus"></span> / <span class="glyphicon glyphicon-minus"></span> &nbsp; Manage Data
                    </button>
                    
                </div>
                
                <!-- DUMMY ELEMENT -->
                <div class="col-lg-1 col-md-1 col-sm-1 col-xs-0"></div>
                
                <br>
                <br>
            
                <!-- HIDDEN TABLE: Data Numbers -->
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 hidden">
                
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

                            <table class="table table-bordered table-striped table-hover">
                                
                                <thead>
                                    <tr>
                                    <td colspan="4">Exchange Rates, Updated <%= sArr[1]%></td>
                                    </tr>
                                </thead>
                                
                                <tbody>
                                    
                                    <tr>

                                        <!-- You can adjust the width of table columns as well -->
                                        <th class="col-md-2"></th>

                                        <!-- Use text alignment like text-center or text-right -->
                                        <th class="text-center"><%= sArr[sArr.length-1]%></th>
                                        <th class="text-center"><%= sArr2[sArr2.length-1]%></th>
                                        <th class="text-center"><%= sArr3[sArr3.length-1]%></th>
                                    </tr>
                                    
                                    <%
                                       
                                       for (int i = 3; i < sArr.length-2; i++){
                                    
       
                                            if( i%2 != 0 ) {
                                    
                                                %>
                                                <tr>
                                                <td><a href="https://www.google.se/search?q=<%=sArr[i]%>+Currency"><%=sArr[i]%> </a></td>   
                                                    
                                            <%           
                                            } else {
                                            %>
                                                <td><%=sArr[i]%></td>
                                                <td><%=sArr2[i]%></td>
                                                <td><%=sArr3[i]%></td>
                                                </tr>
                                            <%
                                            }
                                    
                                        }
                                       
                                    %>
                                    
                                </tbody>
                                
                            </table>
                            
                        </div>
                        
                        <!-- DUMMY ELEMENT -->
                        <div class="col-lg-1 col-md-1 col-sm-1 col-xs-0"></div>
                        
                    </div>
                    
                </div>
                    
                <!-- SHOWING: Raw JSON Container -->    
                <div class="container">
                
                    <div class="row">
                    
                        <!-- DUMMY ELEMENT -->
                        <div class="col-lg-1 col-md-1 col-sm-1 col-xs-0"></div>
                        
                        <!-- JSON Displayer -->
                        <div class="col-lg-10 col-md-10 col-sm-10 col-xs-12 well">
                        
                            <%=DataTruck.feeders.get(0).getJsonResponse().getBody()%>
                        
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
                               int s = DataTruck.feeders.size();
                               for (int i = 0; i < s; i++ ){
                            
                                   %><button type="button" class="<%=DataTruck.feeders.get(i).nameOfFeeder%> btn btn-primary active" role="button">
                                    <%=DataTruck.feeders.get(i).nameOfFeeder%>
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

