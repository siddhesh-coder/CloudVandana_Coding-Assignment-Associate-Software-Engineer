//A => Take a sentence as an input and reverse every word in that sentence.
// a. Example - This is a sunny day > sihT si a ynnus yad.


let sentence = "This is a sunny day"; //sentence

//way 1 (Brute force)
function reverse(string){
  const reverseString = string.split('').reverse().join('').split(' ').reverse().join(' ');
  console.log(`Way 1(Brute force): ${reverseString}`);
}

reverse(sentence);

//Optimize way 2 (Using map())

function rev(string){
   let reverseSent = string.split(' ');

  let newString = reverseSent.map(function(word){
    return word.split('').reverse().join('');
  }).join(' ');

  console.log(`Way 2(Using map()) : ${newString}`);
}

rev(sentence);
