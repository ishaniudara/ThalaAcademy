<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <style>
    .error{
    color:red;}
    </style>
    </head>
    <body><div class="jumbotron">
        <h3></h3>
        <form:form 
          action="processform" modelAttribute="student">
          <h3 class="text-center" style="color:#f5de5f;">Details of Student</h3>
             <table>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name" class="form-control"/><form:errors path="name"   cssClass="error"/></td>
                </tr>
                
                <tr>
                    <td><form:label path="date">Date Of Birth</form:label></td>
                    <td><form:input path="date" class="form-control"/><form:errors path="date" cssClass="error"></form:errors></td>
                </tr>
                 <tr>
                    <td><form:label path="school">School</form:label></td>
                    <td><form:input path="school" class="form-control"/></td>
                </tr>
                 <tr>
                    <td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email" class="form-control"/><form:errors path="email" cssClass="error"></form:errors></td>
                </tr>
                
                <tr>
                    <td><form:label path="contactNumber">
                      Contact Number</form:label></td>
                    <td><form:input path="contactNumber" class="form-control"/><form:errors path="contactNumber" cssClass="error"></form:errors></td>
                </tr>
                
               
            </table>
            <h3 class="text-center" style="color:#f5de5f;">Details of Parents</h3>
            <table>
                <tr>
                    <td><form:label path="pname">Name</form:label></td>
                    <td><form:input path="pname" class="form-control"/><form:errors path="pname" cssClass="error"></form:errors></td>
                </tr>
                
                <tr>
                    <td><form:label path="pemail">Email</form:label></td>
                    <td><form:input path="pemail" class="form-control"/><form:errors path="pemail" cssClass="error"></form:errors></td>
                </tr>
                 <tr>
                    <td><form:label path="address">Permenant Address</form:label></td>
                    <td><form:textarea path="address" class="form-control"/><form:errors path="address" cssClass="error"></form:errors></td>
                </tr>
                
                
                <tr>
                    <td><form:label path="pcontactNumber">
                      Contact Number</form:label></td>
                    <td><form:input path="pcontactNumber" class="form-control"/><form:errors path="pcontactNumber" cssClass="error"></form:errors></td>
                </tr>
                 <tr>
                    <td><form:label path="other">Other Information</form:label></td>
                    <td><form:textarea path="other" class="form-control"/></td>
                </tr>
               
            </table>
            
            <h5>Do you wish to receive information from email?</h5>
            Yes<form:radiobutton path="info" value="yes"/>
             No<form:radiobutton path="info" value="no"/>
             <h5>By ticking this box,  I will confirm that information I have provided is accurate.</h5>
            <form:checkbox path="confirm" value="confirm" /> I confirm
             <br><br>
             <input type="submit" value="submit" class="btn btn-warning">
        </form:form>
        </div>
    </body>
</html>
