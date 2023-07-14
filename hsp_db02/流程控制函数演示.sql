 SELECT IF(TRUE,'BEIJING','SHANGHAI') FROM DUAL; 如果第一个位置为true的话返回第二个，如果为false返回第三个
 IFNULL(NULL,'HSP')FROM DUAL; 如果第一个为空返回第二天，第一个有返回第一个
 SELECT CASE 为真就先返回 如果是假依次向下寻找
 WHEN TRUE THEN 'JACK' 
 WHEN FALSE THEN 'TOM' 
 ELSE 'MARY' END
 
 SELECT ename,IF (comm IS NULL,0.0,comm)
 FROM emp;