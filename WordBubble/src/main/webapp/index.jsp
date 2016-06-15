<!DOCTYPE html>
<html>
<head>
    <title>Word Bubble</title>
    <link rel="stylesheet" type="text/css" href="jqcloud.css" />
    <link rel="stylesheet" type="text/css" href="CSS.css">
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js"></script>
    <script type="text/javascript" src="jqcloud.js"></script>
    <script type="text/javascript">
    
		var str = '${test }'
		
		var array = str.split(';');
		
		var i;
		var word_array_obj;
		var word_array = [];
		
		for (i = 0; i < array.length; i++) {
		  var textAndWeight = array[i];
		  var textWeightArr = textAndWeight.split(':');
		  word_array.push({text: textWeightArr[0], weight: textWeightArr[1]});
		}
		
		$(function() {
		  // When DOM is ready, select the container element and call the jQCloud method, passing the array of words as the first argument.
		  $("#example").jQCloud(word_array, {
			  element_rendered: function(element) {
				    $(element).fadeIn();
				  }});
		});
		
		function refreshPage(){
		    window.location.reload();
		} 
    </script>
  </head>
  <body>
  	<h1>State Farm Trends</h1>
  	<p>
		<input type="text" name="search" placeholder="Click here to search for State Farm Trends!">
		<input type="submit" name="submit" onClick="refreshPage()" value="Submit">
	</p>
    <!-- You should explicitly specify the dimensions of the container element -->
    <div id="example" style="width: 550px; height: 350px;"></div>
  </body>
</html>