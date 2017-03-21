<!DOCTYPE html>
<html>
<head>
  <#include "header.ftl">
  <style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>

<body>

  <#include "nav.ftl">

<div class="container">

<h1>Presentado por Andrés Felipe García Cifuentes</h1>

<table>
  <tr>
    <th>VS</th>
    <th>S</th>
    <th>M</th>
    <th>L</th>
    <th>VL</th>
  </tr>
  <tr>
    <td>${VS}</td>
    <td>${S}</td>
    <td>${M}</td>
    <td>${L}</td>
    <td>${VL}</td>
  </tr>

</div>

</body>
</html>
