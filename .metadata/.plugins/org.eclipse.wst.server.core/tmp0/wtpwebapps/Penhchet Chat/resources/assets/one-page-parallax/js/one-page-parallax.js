$(document).ready(function(){function a(a){var e=scrollMonitor.create(a);e.fullyEnterViewport(function(){t(a.data("nav"))})}function t(a){e||($selector=$(".selector"),"remove"==a?$selector.removeClass("initialised"):($animatedSelector=$('.navigation [data-anchor="'+a+'"]').parents(".animated-selector"),$selector.hasClass("initialised")||$selector.addClass("initialised"),$selector.css({left:$('.navigation [data-anchor="'+a+'"]').position().left+20,width:$('.navigation [data-anchor="'+a+'"]').width()})))}Pleasure.init(),/Android|iPhone|iPad|iPod|BlackBerry|Windows Phone/i.test(navigator.userAgent||navigator.vendor||window.opera)||(skrollr.init({forceHeight:!1}),$("[data-typer-targets]").typer({random:!1,wholeWord:!0}));var e=!1;$(".slide").each(function(){a($(this))}),$("[data-nav-link]").on("click",function(){t($(this).data("anchor")),e=!0,setTimeout(function(){e=!1},300),$(".header").removeClass("active"),$("html, body").animate({scrollTop:$('[data-nav="'+$(this).data("anchor")+'"]').position().top},300)}),$(".logo").on("click",function(){$("html, body").animate({scrollTop:0},"medium"),$(".header").removeClass("active")}),$(".hamburger-btn").on("click",function(){$(".header").toggleClass("active")})});