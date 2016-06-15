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
				  },
				  delay: 100}
				  );
		});
		
		function refreshPage(){
			var searchCriteria = document.getElementById("search").value;
			if (searchCriteria != null && searchCriteria != "") {
				if (searchCriteria.substring(0, 6) == "Person") {
					var name = searchCriteria.substring(8, searchCriteria.length);
					document.getElementById("name").value = name.trim();
					document.getElementById("searchCriteriaPerson").value = searchCriteria;
					document.getElementById("submitByName").submit();
				} else {
					document.getElementById("searchCriteriaAll").value = searchCriteria;
					document.getElementById("submitAll").submit();
				}
			} else {
				document.getElementById("searchCriteriaAll").value = searchCriteria;
				document.getElementById("submitAll").submit();
			}
		} 
    </script>
  </head>
  <body>
  	<h1>State Farm Trends</h1>
  	<p>
		<input type="text" id="search" name="search" value="${searchCriteria }" placeholder="Click here to search for State Farm Trends!">
		<input type="submit" name="submit" onClick="refreshPage()" value="Submit">
	</p>
	<form id="submitAll" action="/words">
		<input type="hidden" id="searchCriteriaAll" name="searchCriteria" />
	</form>
	<form id="submitByName" action="/wordsByPerson">
		<input type="hidden" id="name" name="name" />
		<input type="hidden" id="searchCriteriaPerson" name="searchCriteria" />
	</form>
    <!-- You should explicitly specify the dimensions of the container element -->
    <div id="example" style="width: 550px; height: 350px;"></div>
  </body>
</html>