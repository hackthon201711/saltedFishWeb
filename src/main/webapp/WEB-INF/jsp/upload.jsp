1 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 2 <!DOCTYPE HTML>
 3 <html>
 4 <head>
 5 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 6 <title>单图片上传</title>
 7 </head>
 8 <body>
 9 <fieldset>
10 <legend>图片上传</legend>
11 <h2>只能上传单张10M以下的 PNG、JPG、GIF 格式的图片</h2>
12 <form action="/file/pictureUpload" method="post" enctype="multipart/form-data">
13             <p>
                   选择文件:<input type="file" name="files">
               <p>
                   选择文件:<input type="file" name="files">
               <p>
                   选择文件:<input type="file" name="files">
               <p>
14     <input type="submit" value="上传">
15 </form>
16 </fieldset>
17 </body>
18 </html>