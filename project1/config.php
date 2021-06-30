<?php

$server="localhost";
$username="root";
$password="";
$database ="signup_project1";


$conn=mysqli_connect($server,$username,$password,$database);



if(!$conn){

    echo "<script>alert('connection failed')</script>";
}



?>