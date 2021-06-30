<?php
include 'config.php';
if(isset($_POST['submit']))
{
  $usermail=$_POST['usermail'];
  $password=md5($_POST['password']);
  $cpassword=md5($_POST['cpassword']);

   if($password == $cpassword)
   {
         $sql="SELECT * FROM users WHERE usermail='$usermail'";
         $result =mysqli_query($conn,$sql);
        if(!$result->num_rows >0){
            
            $sql ="INSERT INTO users (usermail,pass) VALUES('$usermail','$password')";
            $result=mysqli_query($conn,$sql);
            if($result){
            echo "<script>alert('registration completed')</script>";
              }
             else{
              echo "<script>alert('something wrong went')</script>";
            }
            }else{
              echo "<script>alert('Email already exists')</script>";
            }
    } else{
       echo "<script>alert('password not matched')</script>";
          }

}
?>

<?php
     include 'config.php';

          session_start();


     if(isset($_POST['submit1']))
     {
       $usermail1=$_POST['usermail1'];
       $password1=md5($_POST['password1']);
      
       $sql="SELECT * FROM users WHERE usermail='$usermail1' AND pass='$password1'";
         $result =mysqli_query($conn,$sql);

        if($result->num_rows >0){
             $row=mysqli_fetch_assoc($result);
             $_SESSION['usermail']=$row['usermail'];
             header("location:project11.php");
        }else{
            echo "<script>alert('Email or password is incorrect')</script>";
        }
    }
?>
<html >
    <head>
        <link rel="stylesheet" href="project1.css">
    </head>
        <body>
            <div class="container">
                <div class="form-box">
                    <div class="button-box">
                        <div id="btn"></div>
                             <button type="button" class="toggle-btn" onclick="login()">LOG IN</button>
                             <button type="button" class="toggle-btn" onclick="signup()">SIGN UP</button>
                    </div>
                    <form class="input-group" id="login" action="" method="POST">
                        <input type="email" class="input" placeholder="enter your email" name="usermail1">
                        <input type="password" class="input" placeholder="enter your password" name="password1">
                       <button type="submit" class="submit-btn" name="submit1"><a>LOG IN</a></button>
                    </form>
                    <form class="input-group" id="signup" action="" method="POST">
                        <input type="email" class="input" placeholder="enter your email" name="usermail">
                        <input type="password" class="input" placeholder="enter your new password" name="password">
                        <input type="password" class="input" placeholder="confirm your password" name="cpassword">
                        <button type="submit" class="submit-btn" name="submit"><a >SIGN UP</a></button>
                    </form>
                </div>
            </div> 
            <script>
                var x=document.getElementById("login");
                var y=document.getElementById("signup");
                var z=document.getElementById("btn");
                function signup()
                {
                    x.style.left="-450px";
                    y.style.left="15px";
                    z.style.left="110px";
                }
                function login()
                {
                    x.style.left="15px";
                    y.style.left="450px";
                    z.style.left="0px";
                }
            </script>       
        </body>
</html>