function solution(n, m, section) {
    var answer = 0;
    if(m == 1){
        answer = section.length;
    }else{
        let covered_max = section[0]
        for(let i =0;i<section.length;i++){
            if(covered_max <= section[i]){
                covered_max = section[i] + m
                answer += 1
            }
        }
    }
    return answer;
}