<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="cri" value="${pageMaker.cri }"/>

<div class="content-wrapper">
	<jsp:include page="../content_header.jsp">
		<jsp:param value="쇼핑몰리스트" name="subject"/>
		<jsp:param value="목록" name="item"/>
	</jsp:include>

	<section>
		<div class="card">
			<div class="card-header with-border">
				<button type="button" class="btn btn-danger" id="" onclick="OpenWindow('registForm.do','글등록',800,700)">글등록</button>
				<div class="card-tools" style="width: 350px;">
					<div class="input-group row">
						<select class="form-control col-md-4" name="searchType" id="searchType">
							<option value="tcw" ${cri.searchType eq 'tw' ? 'selected' : '' }>전 체</option>
							<option value="t" ${cri.searchType eq 't' ? 'selected' : '' }>상 품</option>
							<option value="w" ${cri.searchType eq 'w' ? 'selected' : '' }>작성자</option>
						</select>
						<input class="form-control" type="text" name="keyword" placeholder="검색어를 입력하세요." value="${cri.keyword }">
						<span class="input-group-append">
							<button class="btn btn-dark" type="button" onclick="searchList_go();">
								<i class="fa fa-fw fa-search"></i>
							</button>
						</span>
					</div>
				</div>

    <title>쇼핑몰</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        /* 별도의 CSS 스타일을 추가할 수 있습니다. */
        /* 예시: 배경색과 폰트 스타일 설정 */
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }

        .product-card {
            border: 1px solid #ddd;
            padding: 20px;
            margin: 20px;
            background-color: #fff;
        }

        .product-card img {
            max-width: 100%;
        }

        .product-title {
            font-size: 18px;
            font-weight: bold;
        }

        .product-price {
            color: #e74c3c;
            font-size: 16px;
            font-weight: bold;
        }

        .product-description {
            margin-top: 10px;
        }

        /* 추가적인 스타일을 여기에 추가하세요. */
    </style>
</head>
<body>
    <header>
        <!-- 네비게이션 바 등의 헤더 디자인을 추가할 수 있습니다. -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">쇼핑몰 로고</a>
            <!-- 네비게이션 메뉴 등을 추가할 수 있습니다. -->
        </nav>
    </header>
    <div class="container mt-5">
        <div class="row">
            <!-- 상품 목록 시작 -->
            <div class="col-md-4">
                <div class="product-card">
                    <img src="product1.jpg" alt="상품 이미지">
                    <div class="product-title">상품 제목 1</div>
                    <div class="product-price">가격: $100</div>
                    <div class="product-description">
                    </div>
                    <a href="#" class="btn btn-primary">상세 정보</a>
                </div>
            </div>
            <div class="col-md-4">
                <!-- 다른 상품 카드들도 추가할 수 있습니다. -->
            </div>
            <!-- 상품 목록 끝 -->
        </div>
    </div>
    <footer>
        <!-- 푸터 디자인을 추가할 수 있습니다. -->
        <div class="text-center py-3">
            © 2023 쇼핑몰. 모든 권리 보유.
        </div>
    </footer>
</body>

				
				<div class="card-footer"> 
					<%@ include file="/WEB-INF/views/common/pagination.jsp" %>
				</div>
			</div>
		</section>
	</div>
