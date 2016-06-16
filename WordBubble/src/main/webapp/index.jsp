<!DOCTYPE html>
<html>
<head>
    <title>Word Bubble</title>
    <link rel="stylesheet" type="text/css" href="jqcloud.css" />
    <link rel="stylesheet" type="text/css" href="CSS.css">
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js"></script>
    <script type="text/javascript" src="jqcloud.js"></script>
    <script type="text/javascript">
    
		var str = '${test}'
		
		var array = str.split(';');
		
		var i;
		var word_array_obj;
		var word_array = [];
		
		for (i = 0; i < array.length; i++) {
		  var textAndWeight = array[i];
		  var textWeightArr = textAndWeight.split(':');
		  
		  word_array.push({text: textWeightArr[0], weight: textWeightArr[1], handlers: {
			    click: function() {
			    	if(this.innerHTML == "Android") {
			    		document.getElementById('pop_up').style.display = 'block';
			    		document.getElementById('pop_up_hacking').style.display = 'none';
			    		document.getElementById('right_fake').style.display = 'none';
			    	} else  if(this.innerHTML == "Hacking") {
			    		document.getElementById('pop_up_hacking').style.display = 'block';
			    		document.getElementById('right_fake').style.display = 'none';
			    		document.getElementById('pop_up').style.display = 'none';
			    	} else {
			    		document.getElementById('pop_up_hacking').style.display = 'none';
			    		document.getElementById('pop_up').style.display = 'none';
			    		document.getElementById('right_fake').style.display = 'block';
			    	}
			      }
			    }});
		  
		}
		
		$(function() {
		  // When DOM is ready, select the container element and call the jQCloud method, passing the array of words as the first argument.
		  $("#example").jQCloud(word_array, {
			  colors: ["#800026", "#bd0026", "#e31a1c", "#fc4e2a", "#fd8d3c", "#feb24c", "#fed976", "#ffeda0", "#ffffcc"],
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
				} else if (searchCriteria.substring(0, 9) == "Community") {
					var community = searchCriteria.substring(11, searchCriteria.length);
					document.getElementById("community").value = community.trim();
					document.getElementById("searchCriteriaCommunity").value = searchCriteria;
					document.getElementById("submitByCommunity").submit();
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
  <div id="main_body">
  	<div id="wordCloud" style="width:70%;float:left;">
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
		<form id="submitByCommunity" action="/wordsByCommunity">
			<input type="hidden" id="community" name="community" />
			<input type="hidden" id="searchCriteriaCommunity" name="searchCriteria" />
		</form>
	    <!-- You should explicitly specify the dimensions of the container element -->
	    <div id="example" style="width: 550px; height: 350px;"></div>
	    </div>
	</div>
	
	<div id="right_fake" class="rightColumn" style="color:white;width:30%; float:right;display:block">
		<p>Hey, these are the top trending words! Go us! </p>
	</div>
    
    <div id="pop_up" class="rightColumn" style="color:white;width:30%; float:right;display:none">
    	<p>
    		Joanna Snipes asked a question: For <b>Android</b> development, would it be possible to use a git server to develop an app?
    	</p>
		
		<p>
			Dallas Hub posted a shout out to <b>Android</b> developers in Bloomington, Illinois.
		</p>
		
		<p>
			Ben Adams posted a link for downloading <b>Android</b> Studio.
		</p>
		
		<p>
			Atlanta hub asked a question: What is trending with new <b>Android</b> wearables?
		</p>
		
		<p>
			Joanna Snipes replied to a post - A new version of <b>Android</b> Studio is now available!
		</p>
		</div>
		
		<div id="pop_up_hacking" class="rightColumn" style="color:white;width:30%; float:right;display:none">
		<p>Nive Suresh posted about <b>hacking</b> - what will this mean for State Farm's future?</p>
		
		<p>Joanna Snipes was mentioned in a post - Interested in <b>hacking</b>? Come join us for Hack Day 2016!</p>
		
		<p>Ben Adams shared a link about <b>hacking</b> into vehicles and how that could affect State Farm.</p>
		
		<p>Dallas hub replied to a post about <b>hacking</b> - We have some ideas on how to make cars safer for State Farm customers!</p>
		
		<p>Atlanta hub shared a link about The National Day of <b>Hacking</b>. </p>
		</div>
    
  </body>
</html>