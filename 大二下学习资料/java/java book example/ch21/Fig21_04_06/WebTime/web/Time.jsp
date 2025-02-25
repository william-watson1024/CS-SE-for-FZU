<?xml version="1.0" encoding="UTF-8"?>

<!-- Fig. 21.4 Time.jsp -->
<!-- JSP document generated by Netbeans that displays -->
<!-- the current time on the web server -->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" 
   xmlns:h="http://java.sun.com/jsf/html" 
   xmlns:jsp="http://java.sun.com/JSP/Page" 
   xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
   <jsp:directive.page contentType="text/html;charset=UTF-8" 
      pageEncoding="UTF-8"/>
   <f:view>
      <webuijsf:page id="page1">
         <webuijsf:html id="html1">
            <webuijsf:head id="head1" title="Web Time: A Simple Example">
               <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
               <webuijsf:meta content="60" httpEquiv="refresh" />
            </webuijsf:head>
            <webuijsf:body id="body1" style="-rave-layout: grid">
               <webuijsf:form id="form1">
                  <webuijsf:staticText id="timeHeader" 
                     style="font-size: 18px; left: 24px; top: 24px; 
                        position: absolute" 
                     text="Current time on the web server:"/>
                  <webuijsf:staticText binding="#{Time.clockText}" 
                     id="clockText" style="background-color: black; 
                        color: yellow; font-size: 18px; left: 24px; 
                        top: 48px; position: absolute"/>
               </webuijsf:form>
            </webuijsf:body>
         </webuijsf:html>
      </webuijsf:page>
   </f:view>
</jsp:root>
<!-- 
********************************************************************** 
* (C) Copyright 1992-2009 by Deitel & Associates, Inc. and           *
* Pearson Education, Inc. All Rights Reserved.                       *
*                                                                    *
* DISCLAIMER: The authors and publisher of this book have used their *
* best efforts in preparing the book. These efforts include the      *
* development, research, and testing of the theories and programs    *
* to determine their effectiveness. The authors and publisher make   *
* no warranty of any kind, expressed or implied, with regard to      *
* these programs or to the documentation contained in these books.   *
* The authors and publisher shall not be liable in any event for     *
* incidental or consequential damages in connection with, or         *
* arising out of, the furnishing, performance, or use of these       *
* programs.                                                          *
********************************************************************** 
-->
