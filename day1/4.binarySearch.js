//Binary Search

function findMe(arr, item) {
	let low = 0;
	let high = arr.length - 1;
	let steps = 0;

	while (low <= high) {
		let mid = Math.floor((low + high) / 2); //dividing the array in two part
		let guess = arr[mid];
		steps += 1;
		if (guess === item) {
			let result = `item is index at ${mid}`;
			console.log("steps ", steps);
			return result;
		}
		if (guess > item) {      // If guess is high then it will find in left half
			high = mid - 1;
		}
		if (guess < item) {      // If guess is low then it will find in right half
			low = mid + 1;
		}
	}

	return null;
}

function Arr(length) {  //Functin for creating dynamic array in ascending order
	let arr = [];
	for (let i = 1; i <= length; i++) {
		arr.push(i);
	}
	return arr;
}

let arr = Arr(16000000);

let result = findMe(arr, 2342244);
console.log(result);

/*

Binary Search:- 
                Binary search is a searching algorithm that can item from any ordered list 
                in just few steps. It basically work on low and high method. It creates 
                the half of list and then compare it that itember to be found. It repeatedly 
                do this and in just few method can search the item. 

*/
