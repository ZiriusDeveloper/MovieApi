<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html lang="en" class="no-js k-webkit k-webkit81"><head>
    <title>The Movie Database (Zirius)</title>
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
    <link rel="canonical" href="https://www.themoviedb.org/">
    <link rel="search" type="application/opensearchdescription+xml" title="TMDb Search" href="/opensearch.xml">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,600,700">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto+Mono:300,400">
    <link rel="stylesheet" href="https://www.themoviedb.org/assets/2/application-c61b0ef0324d7162f8f40ceafa7008cfdd0655f87a3426253e10a1f9afabd2e0.css">
    
    
      <link rel="stylesheet" href="https://www.themoviedb.org/assets/2/v4/media-f9239f6faf957a4e35fd33f7eb5926a6ba06a7ae6d6bfc661d5b4ea71e57c30f.css">
      
    
      <link rel="stylesheet" href="https://www.themoviedb.org/assets/2/v4/discover-0b530f97936ffa3c619dbbf1f83546efcc8b36a46c8d5b8adfb399b236e16f33.css">
      
    
      <link rel="stylesheet" href="https://www.themoviedb.org/assets/2/v4/index-504881b47b78eedc1e722041049b6356b472af17e291f96ed68971383b468705.css">
      
    
    
      <meta name="description" content="The Movie Database (TMDb) is a popular, user editable database for movies and TV shows.">
    
   
    


  
    
  </head>
<body class="en v4">
  <noscript><iframe src="https://www.googletagmanager.com/ns.html?id=GTM-5QWVXV" height="0" width="0" style="display:none;visibility:hidden"></iframe></noscript>
  

  <div class="page_wrap _wrap">
<header class="normal no_animation smaller subtle">
  <div class="content">
    <div class="sub_media">
      <div class="nav_wrapper">
        
          <a class="logo" href="/?language=en-US">
		  <!-- Logo Insertion -->
            <img src="https://troypoint.com/wp-content/uploads/2018/11/MediaBox-HD-Icon.png" alt="The Movie Database (TMDb)" width="90" height="60">
          </a>
        

        <ul class="dropdown_menu navigation k-widget k-reset k-header k-menu k-menu-horizontal" data-role="menu" tabindex="0" role="menubar">
          
            <li aria-haspopup="true" class="k-item k-state-default k-first" role="menuitem">
              <a class="no_click k-link k-menu-link" href="${pageContext.request.contextPath}/List/Movie">Movies<span class="k-icon k-i-arrow-60-down k-menu-expand-arrow"></span></a>

            </li>
            <li aria-haspopup="true" class="k-item k-state-default" role="menuitem">
              <a class="no_click k-link k-menu-link" href="${pageContext.request.contextPath}/List/Series">Series<span class="k-icon k-i-arrow-60-down k-menu-expand-arrow"></span></a>
            </li>
            <li aria-haspopup="true" class="k-item k-state-default" role="menuitem">
              <a class="no_click k-link k-menu-link" href="${pageContext.request.contextPath}/adminLogin">Add Entries<span class="k-icon k-i-arrow-60-down k-menu-expand-arrow"></span></a>
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
        <form action="/search" id="search_form"  method="get" accept-charset="utf-8">
          
          <span tabindex="-1" role="presentation" class="k-widget k-autocomplete k-autocomplete-clearable k-state-default" style=""><input dir="auto" id="search_v4" name="query" type="text" tabindex="1" autocorrect="off" autofill="off" autocomplete="off" spellcheck="false" placeholder="Search for a movie, tv show, person..." value="" data-role="autocomplete" class="k-input" role="textbox" aria-haspopup="true" aria-disabled="false" aria-readonly="false" aria-owns="search_v4_listbox" aria-autocomplete="list"><span unselectable="on" class="k-icon k-clear-value k-i-close k-hidden" title="clear" role="button" tabindex="-1"></span><span class="k-icon k-i-loading" style="display:none"></span></span>
		  
          <input type="submit" disabled="">
        </form>
      </div>
    </section>
  </div>
<div class="k-list-container k-popup k-group k-reset" id="search_v4-list" data-role="popup" aria-hidden="true" style="display: none; position: absolute;"><div class="k-group-header" style="display:none"></div><div class="k-list-scroller" unselectable="on"><ul unselectable="on" class="k-list k-reset" tabindex="-1" aria-hidden="true" id="search_v4_listbox" aria-live="polite" data-role="staticlist" role="listbox"></ul></div><div class="k-nodata" style="display:none"><div></div></div></div></header>
<style>
  section.new_index {
    
      background-image: linear-gradient(to right, rgba(var(--tmdbDarkBlue), 0.8) 0%, rgba(var(--tmdbDarkBlue), 0) 100%), url('https://image.tmdb.org/t/p/w1920_and_h600_multi_faces_filter(duotone,032541,01b4e4)/uozb2VeD87YmhoUP1RrGWfzuCrr.jpg');
    
  }
</style>

<main id="main" class="index">
  <section class="inner_content new_index">
    <div id="media_v4" class="media discover">
      <div class="column_wrapper">
        <div class="content_wrapper wrap">
          <div class="title">
            <h2>Welcome.</h2>
            <h3>Millions of movies, TV shows and people to discover. Explore now.</h3>
          </div>

          <div class="search">
            <form:form id="search_form" action="/searchMainMovie" method="POST" accept-charset="utf-8" modelAttribute="SearchLogin">
              
              <form:input path="MovieName" dir="auto" id="search_v4"  style="width:30%" type="text" tabindex="1" autocorrect="off" autofill="off" autocomplete="off" spellcheck="false" placeholder="Search for a movie Name......" value=""/>
			  <form:errors path="MovieName" style="width:30%" />
			  
			  
			  <form:input path="Type" dir="auto" id="search_v4"  style="width:30%" type="text" tabindex="1" autocorrect="off" autofill="off" autocomplete="off" spellcheck="false" placeholder="Search for a Type......" value=""/>
			 
			  <form:input path="Year" dir="auto" id="search_v4"  style="width:30%" type="text" tabindex="1" autocorrect="off" autofill="off" autocomplete="off" spellcheck="false" placeholder="Year of Release......" value=""/>
              <br>
              <label style="width:30%">(Optional)</label>
               <form:errors path="Type" style="width:30%" id="search_v4" type="text" tabindex="1" autocorrect="off" autofill="off" autocomplete="off" spellcheck="false"/>
               <form:errors path="Year" style="width:30%" id="search_v4" type="text" tabindex="1" autocorrect="off" autofill="off" autocomplete="off" spellcheck="false"/>
               <input type="submit" value="Search" onclick="checkLogin()">
            </form:form>
          </div>

        </div>
      </div>
    </div>
  </section>


</main>

<div class="hide">
  <div id="options_tooltip">
    <div class="settings_content">
      
        <div class="group no_pad">
          <p class="no_hover">Want to rate or add this item to a list?</p>
          <p><a href="/login">Login <span class="glyphicons_v2 chevron-right blue pad_left"></span></a></p>
        </div>
        <div class="group">
          <p class="no_hover">Not a member?</p>
          <p><a href="/signup">Sign up and join the community <span class="glyphicons_v2 chevron-right blue pad_left"></span></a></p>
        </div>
      
    </div>
  </div>
</div>

    </div> <!-- page_wrap opened in html_head -->

    <footer class="single_column  ">
      <nav>
        <div class="join">
          <img src="https://www.themoviedb.org/assets/2/v4/logos/v2/blue_square_2-d537fb228cf3ded904ef09b136fe3fec72548ebc1fea3fbbd1ad9e36364db38b.svg" alt="The Movie Database (TMDb)" width="130" height="94">

          
            <a class="rounded" href="/account/signup?language=en-US">Join the Community</a>
          
        </div>

        <div>
          <h3>The Basics</h3>
          <ul>
            <li><a href="/about?language=en-US">About TMDb</a></li>
            <li><a href="/about/staying-in-touch?language=en-US">Contact Us</a></li>
            <li><a href="/talk?language=en-US">Support Forums</a></li>
            <li><a href="/documentation/api?language=en-US">API</a></li>
            <li><a href="https://status.themoviedb.org/" target="_blank" rel="noopener">System Status</a></li>
          </ul>
        </div>
        <div>
      </nav>
    </footer>

    

    
      <div id="new_media_template" class="hide">
        <div class="settings_content">
          <p>Can't find a movie or TV show? Login to create it.</p>
        </div>
      </div>

      <div id="settings_tooltip" class="hide">
        <div class="settings_content">
          <div class="group no_pad">
            <p><a href="/login?language=en-US">Login</a></p>
          </div>
          <div class="group">
            <p><a href="/account/signup?language=en-US">Sign Up</a></p>
          </div>
        </div>
      </div>
    

    <div class="hide">
      <div id="video_popup"></div>
    </div>

    
      <script src="https://www.themoviedb.org/assets/2/jquery.waypoints.inview.min-020c5d0ff05f6c391ec83334e99df1904b2971479d4334ac94fe7bca52bf287a.js"></script>
    

    <script src="https://www.themoviedb.org/assets/2/footer-f73c33066bbc7e867b06d91fb9f11ff6bdec92882532eb56c0dd8a0538d488c0.js"></script>
    
      <script src="https://www.themoviedb.org/assets/2/timeago/locales/jquery.timeago.en-US-f9d144e55407ca11f35de7a0d44b0d54ec1ffc6c4039dffd5a11c0a12e6a9482.js"></script>
    
    
      <script src="https://www.themoviedb.org/assets/2/kendo-2020.1.114/cultures/kendo.culture.en-US.min-0d09204c45f0cfc2f2c297ce501797a7854ddc7583ff654f5f9d3f01fd985f4a.js"></script>
    
    

  
<div class="k-widget k-window" style="visibility: visible; display: none; padding-top: 62px; min-width: 90px; min-height: 50px; width: 700px; top: 3.8px; left: 409.5px; position: fixed;"><div class="k-window-titlebar k-header" style="margin-top: -62px;"><span class="k-window-title">Keyboard Shortcuts</span><div class="k-window-actions"><a role="button" href="#" class="k-button k-bare k-button-icon k-window-action" aria-label="Close"><span class="k-icon k-i-close"></span></a></div></div><div class="content keyboard_shortcuts k-window-content k-content" data-role="window" tabindex="0" style="display: flex;">
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
      </div></div></body></html>