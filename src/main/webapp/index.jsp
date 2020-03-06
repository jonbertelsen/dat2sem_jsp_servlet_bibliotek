<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="includes/header.inc" %>

        <h1 class="text-center mt-4">Søg efter bog</h1>

        <form method="post" action="FrontController?target=resultater">
            <label for="titel"> Bogtitel:</label>
            <input class="form-control" type="text" name="titel" id="titel"/>
            <label for="titel"> Forfatter:</label>
            <input class="form-control" type="text" name="forfatter" id="forfatter"/>
            <label for="aar"> Udgivelsesår:</label>
            <select id="aar" name="udgivelsesaar" class="form-control">
                <option value="2020">2020</option>
                <option value="2019">2019</option>
                <option value="2018">2018</option>
                <option value="2017">2017</option>
                <option value="2016">2016</option>
                <option value="2015">2015</option>
                <option value="2014">2014</option>
                <option value="2013">2013</option>
                <option value="2012">2012</option>

            </select>

            <input type="submit" value="Søg" class="btn btn-outline-primary btn-lg mt-4"/>
        </form>

<%@ include file="includes/footer.inc" %>

