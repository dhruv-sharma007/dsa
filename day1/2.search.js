let arr = [1, 2, 3, 4, 5];
let num = 5;
let find;

for(let i=0; i<=arr.length-1; i++ ){
    if(num == arr[i]){
        find = arr[i]
        break;
    }
}

console.log(find)