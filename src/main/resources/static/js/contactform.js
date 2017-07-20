function validateForm(){
	var contact = document.forms["myForm"]["contact_name"].value;
	var restName = document.forms["myForm"]["restaurant_name"].value;
	var email = document.forms["myForm"]["email"].value;
	var phone = document.forms["myForm"]["phone"].value;
	var address = document.forms["myForm"]["address"].value;
	var city = document.forms["myForm"]["city"].value;
	var zip = document.forms["myForm"]["zip"].value;
	var website = document.forms["myForm"]["website"].value;
	var comment = document.forms["myForm"]["comment"].value;
	if(contact == ""){
		alert("Name must be filled out");
		return false;
	} else if(restName == ""){
		alert("Restaurant name must be filled out");
		return false;
	} else if (email == ""){
		alert("Email must be filled out");
		return false;
	} else if (phone == ""){
		alert("Phone number must be filled out");
		return false;
	} else if (address == ""){
		alert("Address must be filled out");
		return false;
	} else if (city == ""){
		alert("City must be filled out");
		return false;
	} else if (zip == ""){
		alert("Zip code must be filled out");
		return false;
	} else if (website == ""){
		alert("Website URL must be filled out");
		return false;
	} else if (comment == ""){
		alert("Restaurant description must be filled out");
		return false;
	}

}