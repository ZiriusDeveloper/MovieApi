<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en" class="no-js k-webkit k-webkit81"><head>
    <title>Scoob! (2020) — The Movie Database (TMDb)</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="cleartype" content="on">
    <meta charset="utf-8">
    
    <meta name="keywords" content="Movies, TV Shows, Streaming, Reviews, API, Actors, Actresses, Photos, User Ratings, Synopsis, Trailers, Teasers, Credits, Cast">
    <meta name="mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="HandheldFriendly" content="True">
    <meta name="MobileOptimized" content="320">
    
    <meta name="viewport" content="width=1120">
    
    <meta name="msapplication-TileImage" content="https://www.themoviedb.org/assets/2/v4/icons/mstile-144x144-30e7905a8315a080978ad6aeb71c69222b72c2f75d26dab1224173a96fecc962.png">
<meta name="msapplication-TileColor" content="#032541">
<meta name="theme-color" content="#032541">
<link rel="apple-touch-icon" sizes="180x180" href="https://www.themoviedb.org/assets/2/apple-touch-icon-57ed4b3b0450fd5e9a0c20f34e814b82adaa1085c79bdde2f00ca8787b63d2c4.png">
<link rel="icon" type="image/png" sizes="32x32" href="https://www.themoviedb.org/assets/2/favicon-32x32-543a21832c8931d3494a68881f6afcafc58e96c5d324345377f3197a37b367b5.png">
<link rel="icon" type="image/png" sizes="16x16" href="https://www.themoviedb.org/assets/2/favicon-16x16-b362d267873ce9c5a39f686a11fe67fec2a72ed25fa8396c11b71aa43c938b11.png">
<link rel="manifest" href="/manifest.json?version=3">
    <link rel="preconnect" href="https://image.tmdb.org/" crossorigin="">
    <link rel="canonical" href="https://www.themoviedb.org/movie/385103-scooby-doo">
    <link rel="search" type="application/opensearchdescription+xml" title="TMDb Search" href="/opensearch.xml">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,600,700">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto+Mono:300,400">
    <link rel="stylesheet" href="https://www.themoviedb.org/assets/2/application-c61b0ef0324d7162f8f40ceafa7008cfdd0655f87a3426253e10a1f9afabd2e0.css">
    
    
      <link rel="stylesheet" href="https://www.themoviedb.org/assets/2/v4/media-f9239f6faf957a4e35fd33f7eb5926a6ba06a7ae6d6bfc661d5b4ea71e57c30f.css">
      
    
      <link rel="stylesheet" href="https://www.themoviedb.org/assets/2/v4/ott-8ba1c148276d5c56ba11f9d687d4a2baf77db72a1877bf63349cd824e94da015.css">
      
    
      <link rel="stylesheet" href="https://www.themoviedb.org/assets/2/v4/image-f3b526294b3458cf944014905881d178bcda4b47f03ea46cc7d0efd4e328c9e9.css">
      
    
    
        <meta property="og:title" content="Scoob!">
  <meta property="og:description" content="In Scooby-Doo’s greatest adventure yet, see the never-before told story of how lifelong friends Scooby and Shaggy first met and how they joined forces with young detectives Fred, Velma, and Daphne to form the famous Mystery Inc. Now, with hundreds of cases solved, Scooby and the gang face their biggest, toughest mystery ever: an evil plot to unleash the ghost dog Cerberus upon the world. As they race to stop this global “dogpocalypse,” the gang discovers that Scooby has a secret legacy and an epic destiny greater than anyone ever imagined.">
  
    <meta property="og:image" content="https://image.tmdb.org/t/p/w500/jHo2M1OiH9Re33jYtUQdfzPeUkx.jpg">
  
  
    <meta property="og:image" content="https://image.tmdb.org/t/p/w780/fKtYXUhX5fxMxzQfyUcQW9Shik6.jpg">
  

<meta property="og:type" content="movie">
<meta property="og:url" content="https://www.themoviedb.org/movie/385103-scoob?language=en-US">
<meta property="og:site_name" content="The Movie Database">
<meta property="fb:app_id" content="141280979243998">
        <meta name="twitter:card" content="photo">
  <meta name="twitter:title" content="Scoob!">
  <meta name="twitter:description" content="In Scooby-Doo’s greatest adventure yet, see the never-before told story of how lifelong friends Scooby and Shaggy first met and how they joined forces with young detectives Fred, Velma, and Daphne to form the famous Mystery Inc. Now, with hundreds of cases solved, Scooby and the gang face their biggest, toughest mystery ever: an evil plot to unleash the ghost dog Cerberus upon the world. As they race to stop this global “dogpocalypse,” the gang discovers that Scooby has a secret legacy and an epic destiny greater than anyone ever imagined.">
  
    <meta name="twitter:image" content="https://image.tmdb.org/t/p/w780/fKtYXUhX5fxMxzQfyUcQW9Shik6.jpg">
    <meta name="twitter:image:width" content="780">
    <meta name="twitter:image:height" content="439">
  

<meta name="twitter:site" content="@themoviedb">
<meta name="twitter:url" content="https://www.themoviedb.org/movie/385103-scoob?language=en-US">
      
        <meta name="description" content="In Scooby-Doo’s greatest adventure yet, see the never-before told story of how lifelong friends Scooby and Shaggy first met and how they joined forces with young detectives Fred, Velma, and Daphne to form the famous Mystery Inc. Now, with hundreds of cases solved, Scooby and the gang face their biggest, toughest mystery ever: an evil plot to unleash the ghost dog Cerberus upon the world. As they race to stop this global “dogpocalypse,” the gang discovers that Scooby has a secret legacy and an epic destiny greater than anyone ever imagined.">
      
    
    

    <script type="text/javascript" async="" src="https://www.google-analytics.com/plugins/ua/linkid.js"></script><script type="text/javascript" async="" src="https://www.google-analytics.com/analytics.js"></script><script async="" src="https://www.googletagmanager.com/gtm.js?id=GTM-5QWVXV"></script><script src="https://www.themoviedb.org/assets/2/lozad.min-a551962323a9d08c0a254e5be1d4a92da3c0a986c95768aa8c3e6b3f8c8fa42b.js"></script>
    <script src="https://www.themoviedb.org/assets/2/jquery-3.4.1.min-0925e8ad7bd971391a8b1e98be8e87a6971919eb5b60c196485941c3c1df089a.js"></script>
    <script src="https://www.themoviedb.org/assets/2/application-acdffed2de8ea44f74478e194d88d5f699389504ae821b58252e0b08e609a441.js"></script>
    
      <script src="https://www.themoviedb.org/assets/2/application.desktop-fc642e932de23c6d7bd19995577faae48e55c0c22f1b7cf5f9a60845689e5d3c.js"></script>
    
    <script src="https://www.themoviedb.org/assets/2/pusher.min-0fea2c53e9584bbe5ab08cc0397d018a12a9e84e55e8a5b8b34ab0e7b663b5b4.js"></script>

    
  </head>
<body class="en v4">
  <noscript><iframe src="https://www.googletagmanager.com/ns.html?id=GTM-5QWVXV" height="0" width="0" style="display:none;visibility:hidden"></iframe></noscript>
  

  <div class="page_wrap movie_wrap">

<header class="normal no_animation smaller subtle nav-down">
  <div class="content">
    <div class="sub_media">
      <div class="nav_wrapper">
        
          <a class="logo" href="/">
            <img src="https://troypoint.com/wp-content/uploads/2018/11/MediaBox-HD-Icon.png" alt="The Movie Database (TMDb)" width="90" height="60">
          </a>
        

        <ul class="dropdown_menu navigation k-widget k-reset k-header k-menu k-menu-horizontal" data-role="menu" tabindex="0" role="menubar">
          
            <li aria-haspopup="true" class="k-item k-state-default k-first" role="menuitem">
              <a class="no_click k-link k-menu-link" href="${pageContext.request.contextPath}/">Home<span class="k-icon k-i-arrow-60-down k-menu-expand-arrow"></span></a>
            </li>
            <li aria-haspopup="true" class="k-item k-state-default" role="menuitem">
              <a class="no_click k-link k-menu-link" href="/tv">TV Shows<span class="k-icon k-i-arrow-60-down k-menu-expand-arrow"></span></a>
            </li>
          
        </ul>
      </div>
        <div class="flex">
          <ul class="primary">
            
              <li><a href="/login">Login</a></li>
            
          </ul>
        </div>
      
    </div>
  </div>
  <div class="search_bar hide">
    <section class="search show_search_false">
      <div class="sub_media">
        <form id="search_form" action="/search" method="get" accept-charset="utf-8">
          
          <span tabindex="-1" role="presentation" class="k-widget k-autocomplete k-autocomplete-clearable k-state-default" style=""><input dir="auto" id="search_v4" name="query" type="text" tabindex="1" autocorrect="off" autofill="off" autocomplete="off" spellcheck="false" placeholder="Search for a movie, tv show, person..." value="" data-role="autocomplete" class="k-input" role="textbox" aria-haspopup="true" aria-disabled="false" aria-readonly="false" aria-owns="search_v4_listbox" aria-autocomplete="list"><span unselectable="on" class="k-icon k-clear-value k-i-close k-hidden" title="clear" role="button" tabindex="-1"></span><span class="k-icon k-i-loading" style="display:none"></span></span>
          <input type="submit" disabled="">
        </form>
      </div>
    </section>
  </div>
<div class="k-list-container k-popup k-group k-reset" id="search_v4-list" data-role="popup" aria-hidden="true" style="display: none; position: absolute;"><div class="k-group-header" style="display:none"></div><div class="k-list-scroller" unselectable="on"><ul unselectable="on" class="k-list k-reset" tabindex="-1" aria-hidden="true" id="search_v4_listbox" aria-live="polite" data-role="staticlist" role="listbox"></ul></div><div class="k-nodata" style="display:none"><div></div></div></div></header>
<main id="main" class="smaller subtle show_search_false">
  <section class="inner_content movie_content backdrop poster">
    <style>
  
    .k-tooltip.custom_theme {
      background-color: #ffffff;
      color: #000000;
    }

    .custom_theme .k-callout-n {
      border-bottom-color: #ffffff;
    }

    .custom_theme .k-callout-e {
      border-left-color: #ffffff;
    }

    .custom_theme .k-callout-w {
      border-right-color: #ffffff;
    }

    .custom_theme .k-callout-s {
      border-top-color: #ffffff;
    }

    #shortcut_bar_scroller.scroller_wrap, div.single_column_wrapper {
      border-bottom: 1px solid rgba(1.96%, 70.20%, 62.35%, 1.00);
    }

    
      div.header.large.first {
        border-bottom: 1px solid rgba(1.96%, 70.20%, 62.35%, 1.00);
        background-position: right -200px top;
        background-size: cover;
        background-repeat: no-repeat;
        background-image: url('https://image.tmdb.org/t/p/w1920_and_h800_multi_faces/fKtYXUhX5fxMxzQfyUcQW9Shik6.jpg');
      }
    

    section.inner_content section.header div.facts span.certification {
      border: 1px solid rgba(100.00%, 100.00%, 100.00%, 0.60);
      color: rgba(100.00%, 100.00%, 100.00%, 0.60);
    }

    

    section div.header.first div.single_column {
      background: transparent;
    }

    section.inner_content section.header {
      color: #ffffff;
    }

    section.inner_content a, section.media_panel div.menu ul li.active a {
      color: #000;
    }

    section.inner_content a:hover, section.media_panel div.menu ul li.active a:hover {
      color: #00a693;
    }

    section.inner_content section.header ul.actions li.tooltip a, section.inner_content section.header ul.actions li.video a {
      border-color: #ffffff;
      color: #ffffff;
    }

    p.new_button a, section.media_panel div.menu ul li.view_all a, div.episode div.info span.episode_number, section.review div.review_container div.inner_content div.teaser p a {
      color: #00a693;
    }

    p.rounded.new_button a:hover {
      color: #ffffff;
    }

    section.media_panel div.menu ul li.active, section.inner_content ul.shortcut_bar li.selected, section.inner_content ul.shortcut_bar li:hover {
      border-color: #00a693;
    }

    section.content_score div.content_score {
      background-color: rgba(0.00%, 65.10%, 57.65%, 0.60);
    }

    div.settings_panel h3.background_color {
      background-color: #00a693;
    }

    
      section.inner_content div.custom_bg {
        background-image: linear-gradient(to right, rgba(0.00%, 65.10%, 57.65%, 1.00) 150px, rgba(3.92%, 75.29%, 67.06%, 0.84) 100%);
      }

      section.inner_content.no_backdrop.poster div.custom_bg {
        background-image: linear-gradient(to right, rgba(0.00%, 65.10%, 57.65%, 0.84) 0, rgba(3.92%, 75.29%, 67.06%, 0.64) 100%);
      }
    

    section.inner_content section.header a, section.inner_content section.header div.title a {
      color: #ffffff;
    }

    p.new_button.rounded, section.content_score div.content_score div, div.leaderboard div.histogram div.bar span {
      border-color: #00a693;
      background-color: #00a693;
    }

  
</style>


<div class="header large border first" style="background-image: url(${Poster})">
  <div class="keyboard_s custom_bg"  >

    <div class="single_column">
      <section id="original_header" class="images inner">
        <div class="poster_wrapper false">
          <div class="poster">
  
    <div class="image_content backdrop">
  
        
    
      <img class="poster lazyload lazyloaded" src="${Poster}" data-loaded="true">
    
  

    </div>
  

  
</div>

          
        </div>

        <div class="header_poster_wrapper false">
          <section class="header poster">
            <div class="title ott_false" dir="auto">
  

  
    <h2 class="6">
      <a href="/movie/385103-scoob">${Title}</a>
       <span class="tag release_date">${Year}</span>
    </h2>

    
      <div class="facts">
  

  
    
      <span class="certification">
        ${Rated}
      </span>
    

    
      <span class="release">
        ${ReleasedYear}
      </span>
    
  

  

  <span class="genres">
    ${Genre}.
  </span>

  
    <span class="runtime">
      
        ${RunTime}
      
    </span>
  
</div>
    

  
</div>
<ul class="auto actions">
  

  
    <li class="chart">
      <div class="consensus details">
        <div class="outer_ring">
          <div class="user_score_chart" data-percent="81.0" data-track-color="#204529" data-bar-color="#21d07a">
            <div class="percent">
              
                <span class="icon icon-r81"></span>
              
            </div>
          <canvas height="75" width="75" style="height: 60px; width: 60px;"></canvas></div>
        </div>
      </div>
      <div class="text">User<br>Score</div>
    </li>
  

  
    <li class="tooltip use_tooltip list tooltip_hover" title="Login to create and edit custom lists" data-role="tooltip">
      <a class="no_click" href="#"><span class="glyphicons_v2 thumbnails-list white"></span></a>
    </li>
  
  
    <li class="tooltip use_tooltip" title="Login to add this movie to your favorite list" data-role="tooltip">
      <a id="favourite" class="no_click add_to_account_list favourite" href="#"><span class="glyphicons_v2 heart white false"></span></a>
    </li>
  
  
    <li class="tooltip use_tooltip" title="" data-role="tooltip">
      <a id="watchlist" class="no_click add_to_account_list watchlist" href="#"><span class="glyphicons_v2 bookmark white false"></span></a>
    </li>
  
  
    <li class="tooltip use_tooltip rating tooltip_hover" title="Login to rate this movie" data-role="tooltip">
      <a id="rate_it" class="no_click rating" href="#"><span class="glyphicons_v2 star white false"></span></a>
    </li>
  
    
  
</ul>

            <div class="header_info">
              
                <h3 class="tagline" dir="auto">${OverView}.</h3>
              
              <h3 dir="auto">Overview</h3>
              <div class="overview" dir="auto">
                
                  <p>"${OverView}"</p>
                
              </div>

              <ol class="people no_image">
                
                <c:forTokens items="${ScreenPlay}" delims="," var="temp"> 
                  
                    <li class="profile">
                      <p><a href="/person/99363-matt-lieberman">${temp}</a></p>
                      <p class="character">Screenplay, Story</p>
                    </li>
                  
                  </c:forTokens>
                	<li class="profile">
                      <p><a href="/person/23683-tony-cervone">${Director}</a></p>
                      <p class="character">Director</p>
                    </li>
              </ol>
            </div>
          </section>
        </div>
      </section>

      <div id="ott_offers_window" class="hidden">
        
      </div>

    </div>
  </div>
</div>



    <div id="media_v4" class="media movie_v4 header_large">
      <div class="column_wrapper">

  <div class="content_wrapper">
      <div>
        <div class="white_column">

          <section class="panel top_billed scroller">
            <h3 dir="auto">Cast</h3>

            
              <div id="cast_scroller" class="scroller_wrap should_fade is_fading">
                <ol class="people scroller">
                  <c:forTokens items="${Actors}" delims="," var="actors">
                    <li class="card">
                      <a href="/person/62831-will-forte">
                          
    
      					<img class="profile lazyload lazyloaded" data-src="https://image.tmdb.org/t/p/w138_and_h175_face/kphnirb7YggSVEhGI47kACxaIJQ.jpg" data-srcset="https://image.tmdb.org/t/p/w138_and_h175_face/kphnirb7YggSVEhGI47kACxaIJQ.jpg 1x, https://image.tmdb.org/t/p/w276_and_h350_face/kphnirb7YggSVEhGI47kACxaIJQ.jpg 2x" alt="Will Forte" src="https://image.tmdb.org/t/p/w138_and_h175_face/kphnirb7YggSVEhGI47kACxaIJQ.jpg" srcset="https://image.tmdb.org/t/p/w138_and_h175_face/kphnirb7YggSVEhGI47kACxaIJQ.jpg 1x, https://image.tmdb.org/t/p/w276_and_h350_face/kphnirb7YggSVEhGI47kACxaIJQ.jpg 2x" data-loaded="true">
    
  

                      </a>

                      <p><a href="/person/62831-will-forte">${actors}</a></p>
                    </li>
                  </c:forTokens>
                </ol>
                <div class="style_wrapper"></div>
              </div>  
            
          </section>

          <section class="panel media_panel social_panel">
            <section class="review">
              <div class="menu">
                <ul>
                  <li class="active" dir="auto"><a id="reviews" class="media_panel" href="#">Reviews <span>0</span></a></li>
                </ul>
              </div>

              <div class="content">
                
                  <div class="original_content">
  <div class="review_container zero">
    <div class="content zero">
      
        <p class="no_margin" dir="auto">
          
            We don't have any reviews for Scoob!.
          
        </p>
      
    </div>
  </div>
</div>
                
              </div>
            </section>
          </section>

            

        </div>
      </div>

      <div class="grey_column">
        <div>

          <section class="split_column">
            <div>
              <div class="column no_bottom_pad">
                <section class="facts left_column">

  
  <p>
    <strong><bdi>Status</bdi></strong> Released
  </p>

  <p><strong><bdi>Original Language</bdi></strong> ${Language}</p>
  <p><strong><bdi>Budget</bdi></strong> -</p>
  <p><strong><bdi>Revenue</bdi></strong> -</p>
</section>




              </div>
            </div>

            <div>

            </div>

            
              <div class="">
                <p class="rounded new_button pad"><a class="" href="/login"><span class="glyphicons_v2 lock white"></span> Login to Post Review</a></p>
              </div>
            

          </section>

        </div>
      </div>
  </div>

</div>


    </div>
  </section>
</main>

  <div class="hide">
    <div class="rating_stars">
      <input id="rating_input" value="0">
    </div>
    <div id="rating_header_wrapper" class="hide"><div id="rating_details_window"></div></div>
  </div>

<div class="hide">
  <div id="lightbox_window"></div>
</div>

<div class="hide">
  <div id="share_window">
    <section class="main_content content" style="padding: 0;">
  <form class="k-form">
    <fieldset>
      <label class="k-form-field" for="short_url">
        <span><span class="glyphicon_v2 link"></span> URL</span>
        <input class="k-textbox" type="text" name="short_url" value="https://www.themoviedb.org/movie/385103-scoob" onclick="this.select()">
      </label>
    </fieldset>
  </form>
</section>

  </div>
</div>

  <div id="movie_report_window" class="hide">
    <p>You need to be logged in to continue. Click <a href="/login">here</a> to login or <a href="/account/signup">here</a> to sign up.</p>
  </div>

    </div> <!-- page_wrap opened in html_head -->

    <footer class="single_column movie header_large">
      <nav>
        <div class="join">
          <img src="https://www.themoviedb.org/assets/2/v4/logos/v2/blue_square_2-d537fb228cf3ded904ef09b136fe3fec72548ebc1fea3fbbd1ad9e36364db38b.svg" alt="The Movie Database (TMDb)" width="130" height="94">

          
            <a class="rounded" href="/account/signup">Join the Community</a>
          
        </div>

        <div>
          <h3>The Basics</h3>
          <ul>
            <li><a href="/about">About TMDb</a></li>
            <li><a href="/about/staying-in-touch">Contact Us</a></li>
            <li><a href="/talk">Support Forums</a></li>
            <li><a href="/documentation/api">API</a></li>
            <li><a href="https://status.themoviedb.org/" target="_blank" rel="noopener">System Status</a></li>
          </ul>
        </div>

      </nav>

      <section>Build 767ff11 (13)</section>
    </footer>

    

    
      <div id="new_media_template" class="hide">
        <div class="settings_content">
          <p>Can't find a movie or TV show? Login to create it.</p>
        </div>
      </div>

      <div id="settings_tooltip" class="hide">
        <div class="settings_content">
          <div class="group no_pad">
            <p><a href="/login">Login</a></p>
          </div>
          <div class="group">
            <p><a href="/account/signup">Sign Up</a></p>
          </div>
        </div>
      </div>
    

    <div id="keyboard_shortcuts_popup" class="hide">
      
    </div>

    <div class="hide">
      <div id="video_popup"></div>
    </div>

    
      <script src="https://www.themoviedb.org/assets/2/kendo-2020.1.114/kendo.color.min-bae329664ef60d10a5e3dc634af5b2b09a823cc353286ce02e316a0dffcb1509.js"></script>
    
      <script src="https://www.themoviedb.org/assets/2/kendo-2020.1.114/kendo.drawing.min-3e436fcff9817e103f2150d8b523346c8d0d929a077481efa9727e64934c50a9.js"></script>
    
      <script src="https://www.themoviedb.org/assets/2/kendo-2020.1.114/kendo.dataviz.core.min-34ca7bb633c62d5d7697845d1d5745c5ecd41930deb537220ba22406691f5f3a.js"></script>
    
      <script src="https://www.themoviedb.org/assets/2/kendo-2020.1.114/kendo.dataviz.themes.min-8fa4cd84b63ea72ab87f5f589b9a78992e14cf01b64142472452100f09e89133.js"></script>
    
      <script src="https://www.themoviedb.org/assets/2/kendo-2020.1.114/kendo.dataviz.chart.min-95c32b199c766aadf1f7f1687e5e02cab12b2cce0d1d0ba7bcd6ebcaa661032a.js"></script>
    
      <script src="https://www.themoviedb.org/assets/2/kendo-2020.1.114/kendo.dataviz.sparkline.min-33bd4c03da364fb7a2004219e9d12ec814f5923a24d9861319c61ef84249c63e.js"></script>
    

    <script src="https://www.themoviedb.org/assets/2/footer-f73c33066bbc7e867b06d91fb9f11ff6bdec92882532eb56c0dd8a0538d488c0.js"></script>
    
      <script src="https://www.themoviedb.org/assets/2/timeago/locales/jquery.timeago.en-US-f9d144e55407ca11f35de7a0d44b0d54ec1ffc6c4039dffd5a11c0a12e6a9482.js"></script>
    
    
      <script src="https://www.themoviedb.org/assets/2/kendo-2020.1.114/cultures/kendo.culture.en-US.min-0d09204c45f0cfc2f2c297ce501797a7854ddc7583ff654f5f9d3f01fd985f4a.js"></script>
    


  
<div class="k-widget k-window" style="visibility: visible; display: none; padding-top: 62px; min-width: 90px; min-height: 50px; width: 700px; top: 18.3px; left: 409.5px; position: fixed;"><div class="k-window-titlebar k-header" style="margin-top: -62px;"><span class="k-window-title">Keyboard Shortcuts</span><div class="k-window-actions"><a role="button" href="#" class="k-button k-bare k-button-icon k-window-action" aria-label="Close"><span class="k-icon k-i-close"></span></a></div></div><div class="content keyboard_shortcuts k-window-content k-content" data-role="window" tabindex="0" style="display: flex;">
        <div class="column">
          <h3>Global</h3>
          <div><span>s</span> focus the search bar</div>
          <div><span>p</span> open profile menu</div>
          <div><span>esc</span> close an open window</div>
          <div><span>?</span> open keyboard shortcut window</div>

          <h3>On media pages</h3>
          <div><span>b</span> go back (or to parent when applicable)</div>
          <div><span>e</span> go to edit page</div>

          <h3>On TV season pages</h3>
          <div><span>→</span> (right arrow) go to next season</div>
          <div><span>←</span> (left arrow) go to previous season</div>

          <h3>On TV episode pages</h3>
          <div><span>→</span> (right arrow) go to next episode</div>
          <div><span>←</span> (left arrow) go to previous episode</div>

          <h3>On all image pages</h3>
          <div><span>a</span> open add image window</div>
        </div>

        <div class="column">
          <h3>On all edit pages</h3>
          <div><span>t</span> open translation selector</div>
          <div><span>ctrl</span>+ <span>s</span> submit form</div>

          <h3>On discussion pages</h3>
          <div><span>n</span> create new discussion</div>
          <div><span>w</span> toggle watching status</div>
          <div><span>p</span> toggle public/private</div>
          <div><span>c</span> toggle close/open</div>
          <div><span>a</span> open activity</div>
          <div><span>r</span> reply to discussion</div>
          <div><span>l</span> go to last reply</div>
          <div><span>ctrl</span>+ <span>enter</span> submit your message</div>
          <div><span>→</span> (right arrow) next page</div>
          <div><span>←</span> (left arrow) previous page</div>
        </div>
      </div></div><div class="k-animation-container" style="width: 286.413px; overflow: hidden; display: none; position: absolute; top: 289.35px; z-index: 10002; left: 643.3px; margin-top: 6px;" aria-hidden="true"><div role="tooltip" class="k-widget k-tooltip k-popup k-group k-reset custom_theme" data-role="popup" style="display: none; position: absolute; opacity: 0;" aria-hidden="true"><div class="k-tooltip-content">Login to add this movie to your watchlist</div><div class="k-callout k-callout-n" style="left: 143px;"></div></div></div></body></html>