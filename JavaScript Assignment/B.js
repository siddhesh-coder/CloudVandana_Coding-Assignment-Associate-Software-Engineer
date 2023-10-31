//B. Perform sorting of an array in descending order. 

const array = [5,8,2,9,7,1,10,3];

const descendingArray = array.sort(function(a,b){
  return b - a;
})

console.log(`Descending Array: ${descendingArray}`);
