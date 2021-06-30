<html>
    <head>
       <link rel="stylesheet" href="project12.css">
    </head>
    <body>
       <form class="form" action="" method="POST">
           
           <label class="la">EMAIL ADRESS</label><br>
           <label class="la1">WHOM YOU WANT TO MEET</label><br>
           <label class="la2">CAUSE OF APPOINTMENT</label>
           <input type="email" placeholder="enter your email address" class="inputt" name="ma">
           <select class="inputt" name="member">
            <option>---SELECT PERSON---</option>
            <option>DIRECTOR</option>
            <option>PRINCIPAL</option>
            <option>CSE(HOD)</option>
            <option>ECE(HOD)</option>
            <option>IT(HOD)</option>
            <option>EEE(HOD)</option>
            <option>CIVIL(HOD)</option>
            <option>MECH(HOD)</option>
            </select>
           <input type="textarea" placeholder="enter your message" class="inputt" name="message">
           <input type="date"  placeholder="enter date" class="inputt" name="datime">
           <button type="submit" class="sub" >SEND REQUEST</button>
       </form>
    </body>
</html>