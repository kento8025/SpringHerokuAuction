<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<!--落札確認画面-->

<!DOCTYPE html>
<html lang="ja">

<head>

<meta charset="UTF-8">
<link rel="stylesheet"
	href="WebContent/css/product/bid/successfulDid.css">
<title></title>


</head>


<a href="/homePage"> <img src="WebContent/img/Title.png" alt="タイトル"
	width="200" height="80"></a>
<br>

<br>

<div class="parent">

	<div class="children">


		<h2>商品を落札しました。</h2>

		<br> <br> <br> <br>

		<div id="button">

			<form:form action="homePage">
				<button class="back">戻る</button>
			</form:form>




			<form:form action="searchResult" method="get">

				<button class="next">続けて落札する</button>

			</form:form>

		</div>

	</div>

</div>

<body>






</body>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.js">

</script>



</html>











