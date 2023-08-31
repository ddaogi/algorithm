function solution(s, skip, index) {
    var answer = '';
    let nextChar
    let z = 'z';
    let zASCII = z.charCodeAt(0);
    for(let i =0;i<s.length;i++){
        nextChar = s[i]
        for(let j = 0; j<index;j++){
        	nextChar=String.fromCharCode(nextChar.charCodeAt(0)+1)    
            if(nextChar.charCodeAt(0) > zASCII) {
                nextChar = 'a'
            }
            if(skip.includes(nextChar)){
                j--
            }
        }
        answer+=nextChar
       
    }
    return answer;
}