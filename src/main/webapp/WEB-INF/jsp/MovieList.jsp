<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<html lang="en" class="no-js k-webkit k-webkit81">
<head>
<title>Now Playing Movies — The Movie Database (TMDb)</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="cleartype" content="on">
<meta charset="utf-8">

<meta name="keywords"
	content="Movies, TV Shows, Streaming, Reviews, API, Actors, Actresses, Photos, User Ratings, Synopsis, Trailers, Teasers, Credits, Cast">
<meta name="mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="HandheldFriendly" content="True">
<meta name="MobileOptimized" content="320">

<meta name="viewport" content="width=1120">

<meta name="msapplication-TileImage"
	content="https://www.themoviedb.org/assets/2/v4/icons/mstile-144x144-30e7905a8315a080978ad6aeb71c69222b72c2f75d26dab1224173a96fecc962.png">
<meta name="msapplication-TileColor" content="#032541">
<meta name="theme-color" content="#032541">
<link rel="apple-touch-icon" sizes="180x180"
	href="https://www.themoviedb.org/assets/2/apple-touch-icon-57ed4b3b0450fd5e9a0c20f34e814b82adaa1085c79bdde2f00ca8787b63d2c4.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="https://www.themoviedb.org/assets/2/favicon-32x32-543a21832c8931d3494a68881f6afcafc58e96c5d324345377f3197a37b367b5.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="https://www.themoviedb.org/assets/2/favicon-16x16-b362d267873ce9c5a39f686a11fe67fec2a72ed25fa8396c11b71aa43c938b11.png">
<link rel="manifest" href="/manifest.json?version=3">
<link rel="preconnect" href="https://image.tmdb.org/" crossorigin="">
<link rel="canonical"
	href="https://www.themoviedb.org/movie/now-playing">
<link rel="search" type="application/opensearchdescription+xml"
	title="TMDb Search" href="/opensearch.xml">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,600,700">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto+Mono:300,400">
<link rel="stylesheet"
	href="https://www.themoviedb.org/assets/2/application-c61b0ef0324d7162f8f40ceafa7008cfdd0655f87a3426253e10a1f9afabd2e0.css">


<link rel="stylesheet"
	href="https://www.themoviedb.org/assets/2/v4/media-f9239f6faf957a4e35fd33f7eb5926a6ba06a7ae6d6bfc661d5b4ea71e57c30f.css">


<link rel="stylesheet"
	href="https://www.themoviedb.org/assets/2/v4/discover-0b530f97936ffa3c619dbbf1f83546efcc8b36a46c8d5b8adfb399b236e16f33.css">


<link rel="stylesheet"
	href="https://www.themoviedb.org/assets/2/v4/account-3e10f2a51e72666d6ac1f9e863271a074174d7faafdba997d7fe12b2f02ca284.css">



<meta name="description"
	content="The Movie Database (TMDb) is a popular, user editable database for movies and TV shows.">


<script type="text/javascript" async=""
	src="https://www.google-analytics.com/plugins/ua/linkid.js"></script>
<script type="text/javascript" async=""
	src="https://www.google-analytics.com/analytics.js"></script>
<script async=""
	src="https://www.googletagmanager.com/gtm.js?id=GTM-5QWVXV"></script>
<script
	src="https://www.themoviedb.org/assets/2/lozad.min-a551962323a9d08c0a254e5be1d4a92da3c0a986c95768aa8c3e6b3f8c8fa42b.js"></script>
<script
	src="https://www.themoviedb.org/assets/2/jquery-3.4.1.min-0925e8ad7bd971391a8b1e98be8e87a6971919eb5b60c196485941c3c1df089a.js"></script>
<script
	src="https://www.themoviedb.org/assets/2/application-acdffed2de8ea44f74478e194d88d5f699389504ae821b58252e0b08e609a441.js"></script>

<script
	src="https://www.themoviedb.org/assets/2/application.desktop-fc642e932de23c6d7bd19995577faae48e55c0c22f1b7cf5f9a60845689e5d3c.js"></script>

<script
	src="https://www.themoviedb.org/assets/2/pusher.min-0fea2c53e9584bbe5ab08cc0397d018a12a9e84e55e8a5b8b34ab0e7b663b5b4.js"></script>


<script
	src="https://www.themoviedb.org/assets/2/kendo-2020.1.114/kendo.calendar.min-1ac4fcf459b86e888ddcbc69a77c38df08aaaa3a4be0e08d6c5f95b965102515.js"></script>

<script
	src="https://www.themoviedb.org/assets/2/kendo-2020.1.114/kendo.datepicker.min-744edfbaa5e146ea807418cc02aacf72067b93ed5add1abff4aee86dc982133c.js"></script>

<script
	src="https://www.themoviedb.org/assets/2/kendo-2020.1.114/kendo.slider.min-696b258667e295aff456f5700886d2b3cc2528cb840d87d8f9abc8a232d69823.js"></script>



</head>
<body class="en v4">
	<noscript>
		<iframe src="https://www.googletagmanager.com/ns.html?id=GTM-5QWVXV"
			height="0" width="0" style="display: none; visibility: hidden"></iframe>
	</noscript>


	<div class="page_wrap movie_wrap">

		<header class="normal no_animation smaller subtle nav-down">
			<div class="content">
				<div class="sub_media">
					<div class="nav_wrapper">

						<a class="logo" href="/?language=en-US"> <img
							src="https://troypoint.com/wp-content/uploads/2018/11/MediaBox-HD-Icon.png"
							alt="The Movie Database (TMDb)" width="90" height="60">
						</a>


						<ul
							class="dropdown_menu navigation k-widget k-reset k-header k-menu k-menu-horizontal"
							data-role="menu" tabindex="0" role="menubar">

							<li aria-haspopup="true" class="k-item k-state-default k-first"
								role="menuitem"><a class="no_click k-link k-menu-link"
								href="${pageContext.request.contextPath}/">Home<span
									class="k-icon k-i-arrow-60-down k-menu-expand-arrow"></span></a></li>
							<li aria-haspopup="true" class="k-item k-state-default"
								role="menuitem"><a class="no_click k-link k-menu-link"
								href="/tv?language=en-US">Series<span
									class="k-icon k-i-arrow-60-down k-menu-expand-arrow"></span></a></li>

						</ul>
					</div>


					<div class="flex">
						<ul class="primary">

							<li><a href="/login?language=en-US">Login</a></li>

						</ul>
					</div>

				</div>
			</div>
			<div class="search_bar hide">
				<section class="search show_search_false">
					<div class="sub_media">
						<form id="search_form" action="/search?language=en-US"
							method="get" accept-charset="utf-8">

							<input type="hidden" name="language" value="en-US"> <span
								tabindex="-1" role="presentation"
								class="k-widget k-autocomplete k-autocomplete-clearable k-state-default"
								style=""><input dir="auto" id="search_v4" name="query"
								type="text" tabindex="1" autocorrect="off" autofill="off"
								autocomplete="off" spellcheck="false"
								placeholder="Search for a movie, tv show, person..." value=""
								data-role="autocomplete" class="k-input" role="textbox"
								aria-haspopup="true" aria-disabled="false" aria-readonly="false"
								aria-owns="search_v4_listbox" aria-autocomplete="list"><span
								unselectable="on"
								class="k-icon k-clear-value k-i-close k-hidden" title="clear"
								role="button" tabindex="-1"></span><span
								class="k-icon k-i-loading" style="display: none"></span></span> <input
								type="submit" disabled="">
						</form>
					</div>
				</section>
			</div>
			<div class="k-list-container k-popup k-group k-reset"
				id="search_v4-list" data-role="popup" aria-hidden="true"
				style="display: none; position: absolute;">
				<div class="k-group-header" style="display: none"></div>
				<div class="k-list-scroller" unselectable="on">
					<ul unselectable="on" class="k-list k-reset" tabindex="-1"
						aria-hidden="true" id="search_v4_listbox" aria-live="polite"
						data-role="staticlist" role="listbox"></ul>
				</div>
				<div class="k-nodata" style="display: none">
					<div></div>
				</div>
			</div>
		</header>
		<main id="main" class="smaller subtle show_search_false">
		<div class="media">
			<section class="inner_content">
				<div id="media_v4" class="media discover">
					<div class="column_wrapper">
						<div class="content_wrapper">
							<div class="title">
								<h2>Movies List</h2>
							</div>

							<div>
								<div class="white_column no_pad">
									<section id="media_results" class="panel results">
									
										<div class="media_items results">
											<div id="page_1" class="page_wrapper"> 
													
													<div class="card style_1">
													<div class="image">
														<div class="wrapper">

															<a class="image" 
																title="${Poster}"> <img
																class="poster lazyload lazyloaded" src="${Poster}"
																data-loaded="true">



															</a>
														</div>
														<div class="options" data-id="696007"
															data-object-id="5ea046ff162bc3001e03507c"
															data-media-type="movie" data-role="tooltip">
															<a class="no_click" href="#"><div
																	class="glyphicons_v2 circle-more white"></div></a>
														</div>
													</div>
													<div class="content">
														<div class="consensus tight">
															<div class="outer_ring">
																<div class="user_score_chart 5ea046ff162bc3001e03507c"
																	data-percent="50" data-track-color="#423d0f"
																	data-bar-color="#d2d531">
																	<div class="percent">

																		<span class="icon icon-r50"></span>

																	</div>
																	<canvas height="42" width="42"
																		style="height: 34px; width: 34px;"></canvas>
																</div>
															</div>
														</div>
														<h2>
															<a href="/MovieDesc/${Title}" title="${Title}">${subTemp}</a>
														</h2>

														<p>${ReleasedYear}</p>
													</div>

												</div>
												


												









											</div>
									</section>
								</div>
							</div>
						</div>

					</div>
				</div>
		</div>
		</section>
	</div>
	</main>

	</div>
	<!-- page_wrap opened in html_head -->

	<footer class="single_column movie ">
		<nav>
			<div class="join">
				<img
					src="https://www.themoviedb.org/assets/2/v4/logos/v2/blue_square_2-d537fb228cf3ded904ef09b136fe3fec72548ebc1fea3fbbd1ad9e36364db38b.svg"
					alt="The Movie Database (TMDb)" width="130" height="94"> <a
					class="rounded" href="/account/signup?language=en-US">Join the
					Community</a>

			</div>

			<div>
				<h3>The Basics</h3>
				<ul>
					<li><a href="/about?language=en-US">About TMDb</a></li>
					<li><a href="/about/staying-in-touch?language=en-US">Contact
							Us</a></li>
					<li><a href="/talk?language=en-US">Support Forums</a></li>
					<li><a href="/documentation/api?language=en-US">API</a></li>
					<li><a href="https://status.themoviedb.org/" target="_blank"
						rel="noopener">System Status</a></li>
				</ul>
			</div>
		</nav>

	</footer>





	<script
		src="https://www.themoviedb.org/assets/2/jquery.waypoints.inview.min-020c5d0ff05f6c391ec83334e99df1904b2971479d4334ac94fe7bca52bf287a.js"></script>


	<script
		src="https://www.themoviedb.org/assets/2/footer-f73c33066bbc7e867b06d91fb9f11ff6bdec92882532eb56c0dd8a0538d488c0.js"></script>

	<script
		src="https://www.themoviedb.org/assets/2/timeago/locales/jquery.timeago.en-US-f9d144e55407ca11f35de7a0d44b0d54ec1ffc6c4039dffd5a11c0a12e6a9482.js"></script>


	<script
		src="https://www.themoviedb.org/assets/2/kendo-2020.1.114/cultures/kendo.culture.en-US.min-0d09204c45f0cfc2f2c297ce501797a7854ddc7583ff654f5f9d3f01fd985f4a.js"></script>
</body>
</html>