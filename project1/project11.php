<?php

session_start();

?>


<html>
    <head>
        <link rel="stylesheet" href="project11.css">
        <meta http-equiv="X-UA_Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width", intial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="lightslider.css">
        <script type="text/javascript" src="Jquery.js"></script>
        <script type="text/javascript" src="lightslider.js"></script>
        
    </head>
    <body>
        <script type="text/javascript" src="script.js"></script>
        <script type="text/javascript">
            function togglemenu()
            {
                document.getElementById("sidebar").classList.toggle('active');
            }
         </script>
        <header class="header" >
            <ul>
                 <li><a href="#home">Home</a></li>
                 <li><a href="#timing">Timings</a></li>
                 <li><a href="#members">Members</a></li>
            </ul>
        </header>
            <div id="sidebar" onclick="togglemenu()" class="aa">
                <div class="toggle-btn" >
                    <span></span>
                    <span></span>
                    <span></span>
                </div>
                 <ul>
                     <li><a href="#home">Home</a></li>
                     <li><a href="#timing">Timings</a></li>
                     <li><a href="#members">Members</a></li>
                     <li><a href="index.html">Log out</a></li>
                 </ul>
            </div>
            <section id="home">
                <div class="slide-container">
                    <div class="text">
                    <h1>Are you looking for an Appointment..?</h1>
                    </div>
                    <span id="slider-image1"></span>
                    <span id="slider-image2"></span>
                    <span id="slider-image3"></span>
                    <div class="image-container">
                        <img src="11.jpg" class="slider-image">
                        <img src="12.jpg" class="slider-image">
                        <img src="13.jpg" class="slider-image">
                    </div>
                    <div class="button-container">
                        <a href="#slider-image1" class="slider-button"></a>
                        <a href="#slider-image2" class="slider-button"></a>
                        <a href="#slider-image3" class="slider-button"></a>
                    </div>
                </div>
            </section>
            <section id="timing" >
                <div class="time">
                    <ul>
                        <li><h2>Only on Working Days of College</h2></li>
                        <li><h2>MORNING-9:30 AM to 10:30 AM</h2></li>
                        <li><h2>AFTERNOON-3:00 PM to 4:00 PM</h2></li>
                    </ul>
                </div>
                <img src="i2.jpg" class="imm">
            </section>
            
        <section id="members" class="sliderr">
            <ul id="autoWidth">                    
                <li class="item-a">
                    <div class="box">
                        <div class="slide-image">
                           <img src="p1.jpg" alt="p1">
                           <div class="overlay">
                               <a href="project12.html" class="app-btn">APPOINTMENT</a>
                           </div>
                        </div>
                        <div class="detail-box">
                            <div class="typ">
                                <a href="#">Computer Science and Engineering(HOD)</a>
                            </div>
                        </div>
                    </div>
                </li>
                <li class="item-b">
                    <div class="box">
                        <div class="slide-image">
                           <img src="p2.jpg" alt="p2">
                           <div class="overlay">
                               <a href="project12.html" class="app-btn">APPOINTMENT</a>
                           </div>
                        </div>
                        <div class="detail-box">
                            <div class="typ">
                                <a href="#">Principal of the University</a>
                            </div>
                        </div>
                    </div>
                </li>
                <li class="item-c">
                    <div class="box">
                        <div class="slide-image">
                           <img src="p3.jpg" alt="p3">
                           <div class="overlay">
                               <a href="project12.html" class="app-btn">APPOINTMENT</a>
                           </div>
                        </div>
                        <div class="detail-box">
                            <div class="typ">
                                <a href="#">Information Technology(HOD)</a>
                            </div>
                        </div>
                    </div>
                </li>
                <li class="item-d">
                    <div class="box">
                        <div class="slide-image">
                           <img src="p4.jpeg" alt="p4">
                           <div class="overlay">
                               <a href="project12.html" class="app-btn">APPOINTMENT</a>
                           </div>
                        </div>
                        <div class="detail-box">
                            <div class="typ">
                                <a href="project12.html">Director of the University</a>
                            </div>
                        </div>
                    </div>
                </li>
                <li class="item-e">
                    <div class="box">
                        <div class="slide-image">
                           <img src="p5.jpg" alt="p5">
                           <div class="overlay">
                               <a href="project12.html" class="app-btn">APPOINTMENT</a>
                           </div>
                        </div>
                        <div class="detail-box">
                            <div class="typ">
                                <a href="#">Electronics and Communication Engineering</a>
                            </div>
                        </div>
                    </div>
                </li>
                <li class="item-f">
                    <div class="box">
                        <div class="slide-image">
                           <img src="p6.jpg" alt="p6">
                           <div class="overlay">
                               <a href="project12.html" class="app-btn">APPOINTMENT</a>
                           </div>
                        </div>
                        <div class="detail-box">
                            <div class="typ">
                                <a href="#">Electrical Engineering(HOD)</a>
                            </div>
                        </div>
                    </div>
                </li>
                <li class="item-g">
                    <div class="box">
                        <div class="slide-image">
                           <img src="p7.jpg" alt="p7">
                           <div class="overlay">
                               <a href="project12.html" class="app-btn">APPOINTMENT</a>
                           </div>
                        </div>
                        <div class="detail-box">
                            <div class="typ">
                                <a href="#">Mechanical Engineering(HOD) </a>
                            </div>
                        </div>
                    </div>
                </li>
                <li class="item-h">
                    <div class="box">
                        <div class="slide-image">
                           <img src="p8.jpg" alt="p8">
                           <div class="overlay">
                               <a href="project12.html" class="app-btn">APPOINTMENT</a>
                           </div>
                        </div>
                        <div class="detail-box">
                            <div class="typ">
                                <a href="#">Civil Engineering(HOD)</a>
                            </div>
                        </div>
                    </div>
                </li>
              </ul>                     
    </section>
    </body>
</html>