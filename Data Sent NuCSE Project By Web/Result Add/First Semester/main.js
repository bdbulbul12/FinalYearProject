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
var messagesRef = firebase.database().ref("2013-2014").child("firstsemester");


// Listen for form submit
document.getElementById('contactForm').addEventListener('submit', submitForm);

// Submit form
function submitForm(e){
  e.preventDefault();

  // Get values
  
  var name = getInputVal('name');
  var reg = getInputVal('reg');
  var colllegeName = getInputVal('colllegeName');
  var session = getInputVal('session');
  var itcs = getInputVal('itcs');
  var pl = getInputVal('pl');
  var plPractical = getInputVal('plPractical');
  var physics = getInputVal('physics');
  var math = getInputVal('math');
  var english = getInputVal('english');
  

  // Save message
  saveMessage(name,reg,colllegeName,session,itcs,pl,plPractical,physics,math,english);

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
function saveMessage(name,reg,colllegeName,session,itcs,pl,plPractical,physics,math,english){
  var newMessageRef = messagesRef.push();
  newMessageRef.set({
    
    name:name,
    reg:reg,
    colllegeName:colllegeName,
    session:session,
    itcs:itcs,
    pl:pl,
    plPractical:plPractical,
    physics:physics,
    math:math,
    english:english
    
  });
}