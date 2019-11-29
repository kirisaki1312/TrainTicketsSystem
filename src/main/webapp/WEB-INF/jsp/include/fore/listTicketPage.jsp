
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<div class="listTicketTableDiv col-lg-12">
    <table class="table table-striped table-bordered table-hover table-condensed">
        <thead>
        <tr class="success">
            <th>Train_id</th>
            <th>Train_name</th>
            <th>Start_city</th>
            <th>End_city</th>
            <th>Start_time</th>
            <th>End_time</th>
            <th>Mileage</th>
            <th>Firstseat_num</th>
            <th>预订一等座</th>
            <th>Secondseat_num</th>
            <th>预订二等座</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${qt}" var="t">
            <tr>
                <td>${t.train_id}</td>
                <td>${t.train_name}</td>
                <td>${t.start_city}</td>
                <td>${t.end_city}</td>
                <td>${t.start_time}</td>
                <td>${t.end_time}</td>
                <td>${t.mileage}km</td>

                <c:if test="${empty t.firstseat_num}">
                    <td>0张</td>
                    <td></td>
                </c:if>
                <c:if test="${t.firstseat_num>=1}">
                    <td>${t.firstseat_num}张</td>
                    <td>
                        <a href="forebookTickt?train_id=${t.train_id}&train_name=${t.train_name}&start_index=${t.start_index}
                        &end_index=${t.end_index}&start_time=${t.start_time}&end_time=${t.end_time}&mileage=${t.mileage}&seat_type_choose=1">
                            <span class="glyphicon glyphicon-shopping-cart"></span>
                        </a>
                    </td>
                </c:if>

                <c:if test="${empty t.secondseat_num}">
                    <td>0张</td>
                    <td></td>
                </c:if>
                <c:if test="${t.secondseat_num>=1}">
                    <td>${t.secondseat_num}张</td>
                    <td>
                        <a href="forebookTickt?train_id=${t.train_id}&train_name=${t.train_name}&start_index=${t.start_index}
                        &end_index=${t.end_index}&start_time=${t.start_time}&end_time=${t.end_time}&mileage=${t.mileage}&seat_type_choose=2">
                            <span class="glyphicon glyphicon-shopping-cart"></span>
                        </a>
                    </td>
                </c:if>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%--<div class="pageDiv" style="text-align:center;">--%>
<%--    <%@include file="Paging.jsp" %>--%>
<%--</div>--%>

<br/><br/><br/><br/><br/><br/><br/><br/>
