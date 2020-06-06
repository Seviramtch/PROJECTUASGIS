<?php
$username = "id13234641_root5";
$servername = "localhost";
$dbname = "id13234641_pombensin";
$password = "Sevira020999*";

//buat koneksi
$conn = new mysql($servername, $username, $password, $dbname);

//kondisi cek koneksi
if($conn->connect_error) {
	die("connection failed". $conn->connect_error);
}
$sql = "SELECT * FROM pombensin";

$result = $conn->query($sql);
$data = array();

if ($result->num_rows>0)

{
	while ($row=$result->fetch_assoc()) {
		$data[]= $row;
	}
}else {
	echo "0 result";
}
echo json_encode($data);
$conn->close();




?>