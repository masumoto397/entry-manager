INSERT INTO entry_info (
    entry_id, req_date, entry_date, entry_time_s, entry_time_e, req_user, req_group, 
    entry_user1, entry_user2, entry_user3, entry_user4, entry_user5, 
    req_reason, remark, status, conform_user1, conform_user2, conform_user3
) VALUES 
(1, '20240101', '20240101', 8, 10, 'U001', 'G1', 
 'U002', 'U003', 'U004', 'U005', 'U006', 
 'System maintenance', 'Urgent request', 'A', 'C001', 'C002', 'C003'),

(1, '20240102', '20240102', 9, 11, 'U002', 'G2', 
 'U003', 'U004', 'U005', 'U006', 'U007', 
 'Database backup', 'Routine operation', 'B', 'C004', 'C005', 'C006');
