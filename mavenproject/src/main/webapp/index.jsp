<html>
<head>
    <script language="JavaScript" src="common/js/jquery-3.5.1/jquery-3.5.1.min.js"/>
    <script type="text/javascript">
        $(function (){
           console.log("开始");
           $.ajax({
               url:"/getMeg",
               success:function (data){
                   console.log("结束")
                   console.log(data);
               }

           })

        });
    </script>
</head>
<body>
<h2>1111111</h2>
</body>
</html>
