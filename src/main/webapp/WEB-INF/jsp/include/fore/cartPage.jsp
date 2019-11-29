<%--
  Created by IntelliJ IDEA.
  User: 谢瑞杰
  Date: 2019/6/24
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<title>已预订的车票</title>

<div class="cartTableDiv col-lg-12">
    <table class="table table-striped table-bordered table-hover table-condensed">
        <thead>
        <tr class="success">
            <th>Ticket_id</th>
            <th>Train_name</th>
            <th>Seat_type</th>
            <th>Start_stop_name</th>
            <th>End_stop_name</th>
            <th>Start_time</th>
            <th>End_time</th>
            <th>Create_at</th>
            <th>Expense</th>
            <th>Status</th>
            <th>取消订票</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${bought}" var="b">
            <tr>
                <td>${b.ticket_id}</td>
                <td>${b.train_name}</td>
                <td>${b.seat_type}</td>
                <td>${b.start_city}</td>
                <td>${b.end_city}</td>
                <td>${b.start_time}</td>
                <td>${b.end_time}</td>
                <td>${b.create_at}</td>
                <td>${b.expense}元</td>
                <td>${b.status}</td>
                <td>
                    <a deleteLink="true" href="forecancelTicket?ticket_id=${b.ticket_id}">
                        <span class="glyphicon glyphicon-trash"></span>
                    </a>
                </td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<div class="pageDiv" style="text-align:center;">
    <%@include file="Paging.jsp" %>
</div>
