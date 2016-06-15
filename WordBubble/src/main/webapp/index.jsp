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
		alert(array);
		
		var i;
		var word_array_obj;// = {text: textWeightArr[0], weight: textWeightArr[1]}
		var word_array = [];
		
		for (i = 0; i < array.length; i++) {
		  var textAndWeight = array[i];
		  var textWeightArr = textAndWeight.split(':');
		  alert(textWeightArr[0]);
		  alert(textWeightArr[1]);
		  //word_array_obj = {text: textWeightArr[0], weight: textWeightArr[1]};
		  word_array.push({text: textWeightArr[0], weight: textWeightArr[1]});
		}
		
		/*var word_array = [
			{text: "Lorem", weight: 15},
			{text: "Ipsum", weight: 9, link: "http://jquery.com/"},
			{text: "Dolor", weight: 6, html: {title: "I can haz any html attribute"}},
			{text: "Sit", weight: 7},
			{text: "Amet", weight: 5},
			{text: "MySites", weight: 6},
			{text: "Hack Day", weight: 4},
			{text: "Ovation", weight: 8},
			{text: "IT Modernization", weight: 3},
			{text: "AskOak", weight: 5}
			// ...as many words as you want
		];*/
		
		$(function() {
		  // When DOM is ready, select the container element and call the jQCloud method, passing the array of words as the first argument.
		  $("#example").jQCloud(word_array);
		});
		
		function goTo(){
		    location.href = document.getElementById('link_id').value;
		}
    </script>
  </head>
  <body>
  	<h1>State Farm Trends</h1>
	<form>
    	<input type="text" placeholder="Search..." required>
    	<input type="button" value="Search">
	</form>
    <!-- You should explicitly specify the dimensions of the container element -->
    <div id="example" style="width: 550px; height: 350px;"></div>
  </body>
</html>