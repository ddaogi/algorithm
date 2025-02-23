def solution(total_boxes, boxes_per_row, target_box): 
    columns = [[] for _ in range(boxes_per_row)]
    current_row = 0
    
    # 상자들을 지그재그 형태로 열에 할당
    for box_number in range(1, total_boxes + 1):
        if box_number % boxes_per_row == 1:
            current_row += 1
        if current_row % 2 == 1:
            columns[(box_number - 1) % boxes_per_row].append(box_number)
        else:
            columns[-(box_number % boxes_per_row)].append(box_number)
    
    # 각 열에서 target_box의 위치(위에서 몇 번째인지) 찾기
    for column in columns:
        count = 0
        for idx in range(len(column) - 1, -1, -1):
            count += 1
            if column[idx] == target_box:
                target_position = count
                
    return target_position
