// Initialize Firebase (ADD YOUR OWN DATA)
var config = {
    apiKey: "AIzaSyBX0Y7QL5uS4RolewvqcIAcMy9Aur9BH6Q",
    authDomain: "nuhelpdesk-2c486.firebaseapp.com",
    databaseURL: "https://nuhelpdesk-2c486.firebaseio.com",
    projectId: "nuhelpdesk-2c486",
    storageBucket: "nuhelpdesk-2c486.appspot.com",
    messagingSenderId: "210270431666"

};
firebase.initializeApp(config);

// Reference messages collection// Ei khane sudhu change korte hbe..
var messagesRef = firebase.database().ref('notice');


// Listen for form submit
document.getElementById('contactForm').addEventListener('submit', submitForm);

// Submit form
function submitForm(e){
  e.preventDefault();

  // Get values
  
  var title = getInputVal('title');
  var date = getInputVal('date');
  var url = getInputVal('url');
  // var mcq3 = getInputVal('mcq3');
  // var mcq4 = getInputVal('mcq4');
  // var ans = getInputVal('ans');

  // Save message
  saveMessage(title, date,url);

  // Show alert
  document.querySelector('.alert').style.display = 'block';

  // Hide alert after 3 seconds
  setTimeout(function(){
    document.querySelector('.alert').style.display = 'none';
  },3000);

  // Clear form
  document.getElementById('contactForm').reset();
}

// Function to get get form values
function getInputVal(id){
  return document.getElementById(id).value;
}

// Save message to firebase
function saveMessage( title, date,url){
  var newMessageRef = messagesRef.push();
  newMessageRef.set({
    
    title:title,
    date:date,
    url:url
    // mcq2:mcq2,
    // mcq3:mcq3,
    // mcq4:mcq4,
    // ans:ans
  });
}