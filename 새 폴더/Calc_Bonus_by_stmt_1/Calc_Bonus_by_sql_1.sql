CREATE TABLE BONUS_LARGE ( YYYYMM  CHAR(6),
                           EMPNO  NUMBER(8),
                           JOB   VARCHAR2(9), 
                           DEPTNO  NUMBER(2), 
                           SAL   NUMBER(7,2), 
                           BONUS  NUMBER(7,2) 
  ) TABLESPACE USERS; 
  
select * from BONUS_LARGE;
delete  from bonus_large111;
drop table BONUS_LARGE;
-- COUNT
select count(*) from BONUS_LARGE;


CREATE TABLE BONUS_LARGE2 ( YYYYMM  CHAR(6),
                           EMPNO  NUMBER(8),
                           JOB   VARCHAR2(9), 
                           DEPTNO  NUMBER(2), 
                           SAL   NUMBER(7,2), 
                           BONUS  NUMBER(7,2) 
  ) TABLESPACE USERS; 

select * from BONUS_LARGE2;




delete  from bonus_large222;
drop table BONUS_LARGE2222;


SELECT YYYYMM,DEPTNO,SUM(BONUS) FROM BONUS_LARGE4 
 GROUP BY YYYYMM,DEPTNO 
 ORDER BY YYYYMM,DEPTNO; 
 
 
select count(*) from BONUS_LARGE2;
  
CREATE TABLE BONUS_LARGE3 ( YYYYMM  CHAR(6),
                           EMPNO  NUMBER(8),
                           JOB   VARCHAR2(9), 
                           DEPTNO  NUMBER(2), 
                           SAL   NUMBER(7,2), 
                           BONUS  NUMBER(7,2) 
) TABLESPACE USERS; 
 
select * from BONUS_LARGE4;


delete  from bonus_large333;
drop table BONUS_LARGE3;

select count(*) from BONUS_LARGE4;

CREATE TABLE BONUS_LARGE4 ( YYYYMM  CHAR(6),
                           EMPNO  NUMBER(8),
                           JOB   VARCHAR2(9), 
                           DEPTNO  NUMBER(2), 
                           SAL   NUMBER(7,2), 
                           BONUS  NUMBER(7,2) 
  ) TABLESPACE USERS; 
 
select * from BONUS_LARGE4;
delete  from bonus_large444;
drop table BONUS_LARGE4;

select count(*) from BONUS_LARGE4;




CREATE TABLE BONUS_LARGE5 ( YYYYMM  CHAR(6),
                           EMPNO  NUMBER(8),
                           JOB   VARCHAR2(9), 
                           DEPTNO  NUMBER(2), 
                           SAL   NUMBER(7,2), 
                           BONUS  NUMBER(7,2) 
  ) TABLESPACE USERS; 
 
select * from BONUS_LARGE5;



delete  from bonus_large55;
drop table BONUS_LARGE55;

select count(*) from BONUS_LARGE5;


CREATE TABLE BONUS_LARGE6 ( YYYYMM  CHAR(6),
                           EMPNO  NUMBER(8),
                           JOB   VARCHAR2(9), 
                           DEPTNO  NUMBER(2), 
                           SAL   NUMBER(7,2), 
                           BONUS  NUMBER(7,2) 
  ) TABLESPACE USERS; 
 
select * from BONUS_LARGE6;
select count(*) from BONUS_LARGE6;


CREATE TABLE BONUS_LARGE7 ( YYYYMM  CHAR(6),
                           EMPNO  NUMBER(8),
                           JOB   VARCHAR2(9), 
                           DEPTNO  NUMBER(2), 
                           SAL   NUMBER(7,2), 
                           BONUS  NUMBER(7,2) 
  ) TABLESPACE USERS; 
  

@C:\03_SQL\LOOP.SQL

CREATE TABLE BONUS_LARGE8 ( YYYYMM  CHAR(6),
                           EMPNO  NUMBER(8),
                           JOB   VARCHAR2(9), 
                           DEPTNO  NUMBER(2), 
                           SAL   NUMBER(7,2), 
                           BONUS  NUMBER(7,2) 
  ) TABLESPACE USERS; 
 CREATE TABLE BONUS_LARGE22 ( YYYYMM  CHAR(6),
                           EMPNO  NUMBER(8),
                           JOB   VARCHAR2(9), 
                           DEPTNO  NUMBER(2), 
                           SAL   NUMBER(7,2), 
                           BONUS  NUMBER(7,2) 
  ) TABLESPACE USERS; 


 SELECT * FROM BONUS_LARGE23; 
  
SELECT COUNT(*) FROM BONUS_LARGE16;

SELECT YYYYMM,DEPTNO,SUM(BONUS) FROM BONUS_LARGE16 
 GROUP BY YYYYMM,DEPTNO 
 ORDER BY YYYYMM,DEPTNO; 
 
@C:\03_SQL\DBMS_OUTPUT_1.SQL


---------------------------------------------------------------------------------------
--ERROR LOG TABLE
CREATE TABLE ERROR_LOG ( COUNT NUMBER,
						 PROGRAM_NAME VARCHAR2(30),
             LOG_DATE VARCHAR2(30),
             LOG_TIME VARCHAR2(30),
						 ERR_CODE VARCHAR2(30),
						 ERR_MSG VARCHAR2(50)
						);
---------------------------------------------------------------------------------------
--BONUS TABLE WITH PRIMARY KEY          
CREATE TABLE BONUS_LARGE23 ( YYYYMM  CHAR(6),
                           EMPNO  NUMBER(8),
                           JOB   VARCHAR2(9), 
                           DEPTNO  NUMBER(2), 
                           SAL   NUMBER(7,2), 
                           BONUS  NUMBER(7,2),
                           CONSTRAINT PK_BONUS PRIMARY KEY (YYYYMM,EMPNO)
  ) TABLESPACE USERS;
---------------------------------------------------------------------------------------
--BONUS TABLE WITH NON-PRIMARY KEY 
  CREATE TABLE BONUS_LARGE23 ( YYYYMM  CHAR(6),
                           EMPNO  NUMBER(8),
                           JOB   VARCHAR2(9), 
                           DEPTNO  NUMBER(2), 
                           SAL   NUMBER(7,2), 
                           BONUS  NUMBER(7,2)
  ) TABLESPACE USERS;
---------------------------------------------------------------------------------------
--DATA_PROC_LOG TABLE WITH PRIMARY KEY 
CREATE TABLE DATA_PROC_LOG ( COUNT NUMBER CONSTRAINT PK_COUNT PRIMARY KEY,
							 PROGRAM_NAME VARCHAR2(30),
               				 CURR_DATE VARCHAR2(30),
							 CURR_TIME VARCHAR2(30),
							 PROCESSING VARCHAR2(30)
							);
							
							
------------------------						
DROP TABLE BONUS_LARGE23;
DROP TABLE DATA_PROC_LOG;
DROP TABLE ERROR_LOG;
------------------------

SELECT * FROM BONUS_LARGE23;	
SELECT * FROM DATA_PROC_LOG;
SELECT * FROM ERROR_LOG;

--==========================================BULKBINDING============
--=================================================================
--=================================================================
---------------------------------------------------------------------------------------
--ERROR LOG TABLE
CREATE TABLE ERROR_LOG2 ( COUNT NUMBER,
						 PROGRAM_NAME VARCHAR2(30),
             			 LOG_DATE VARCHAR2(30),
             			 LOG_TIME VARCHAR2(30),
						 ERR_CODE VARCHAR2(30),
						 ERR_MSG VARCHAR2(50)
						);

---------------------------------------------------------------------------------------
--BONUS TABLE WITH NON-PRIMARY KEY 
--LIMIT 10
  CREATE TABLE BONUS_LARGE24 ( YYYYMM  CHAR(6),
                           EMPNO  NUMBER(8),
                           JOB   VARCHAR2(9), 
                           DEPTNO  NUMBER(2), 
                           SAL   NUMBER(7,2), 
                           BONUS  NUMBER(7,2)
  ) TABLESPACE USERS;
---------------------------------------------------------------------------------------
--DATA_PROC_LOG TABLE WITH PRIMARY KEY 
CREATE TABLE DATA_PROC_LOG2 ( COUNT NUMBER CONSTRAINT PK_COUNT2 PRIMARY KEY,
							 PROGRAM_NAME VARCHAR2(30),
               				 CURR_DATE VARCHAR2(30),
							 CURR_TIME VARCHAR2(30),
							 PROCESSING VARCHAR2(30)
							);
							
							
---------------------------------------------------------------------------------
---------------------------------------------------------------------------------
SET SERVEROUTPUT ON
<<MAIN_BLK>>
DECLARE
    CURSOR CUR_BONUS IS -- create cursor
      SELECT SAL, JOB, DEPTNO, EMPNO,
        CASE WHEN DEPTNO = 10 THEN SAL*0.3 -- bonus calculate
             WHEN DEPTNO = 20 THEN SAL*0.1
             WHEN DEPTNO = 30 THEN SAL*0.05
             ELSE SAL*0.2
        END AS BONUS
        FROM EMP_LARGE
        WHERE JOB != 'PRESIDENT'; -- except President     
        V_SAL    EMP.SAL%TYPE;
        V_JOB    EMP.JOB%TYPE;
        V_DEPTNO EMP.DEPTNO%TYPE;
        V_EMPNO  NUMBER;
        V_BONUS  BONUS_LARGE12.BONUS%TYPE;
        V_COUNT NUMBER;
     
BEGIN
      OPEN CUR_BONUS; -- open cursor
      V_COUNT := 1;
      
      INSERT INTO DATA_PROC_LOG(COUNT,PROGRAM_NAME,CURR_DATE,CURR_TIME,PROCESSING) -- insert the begin of DATA_PROCESSING_LOGGING
              VALUES(V_COUNT,'BONUS_V1.0',TO_CHAR(SYSDATE, 'YYYY/MM/DD'),TO_CHAR(SYSTIMESTAMP, 'HH:MI:SS'),'BEGIN PROCSESSING');
      LOOP -- loop start
          FETCH CUR_BONUS INTO V_SAL,V_JOB,V_DEPTNO,V_EMPNO,V_BONUS;
          EXIT WHEN CUR_BONUS%NOTFOUND;
          
          INSERT INTO BONUS_LARGE23(YYYYMM,EMPNO,JOB,DEPTNO,SAL,BONUS)  -- insert date to BONUS_LARGE23 table
                VALUES(TO_CHAR(SYSDATE, 'YYYYMM'),V_EMPNO,V_JOB,V_DEPTNO,V_SAL,V_BONUS);
          IF  (MOD(V_COUNT,300000) = 0)  -- if count reached to 300,000 insert to DATA_PROCESSING_LOGGING
          THEN
          DBMS_OUTPUT.PUT_LINE ('DATA_PROCESSING_LOGGING INSERTED');
          INSERT INTO DATA_PROC_LOG(COUNT,PROGRAM_NAME,CURR_DATE,CURR_TIME,PROCESSING)
              VALUES(V_COUNT,'BONUS_V1.0',TO_CHAR(SYSDATE, 'YYYY/MM/DD'),TO_CHAR(SYSTIMESTAMP, 'HH:MI:SS'),'PROCSESSING...');  
          END IF;      
             <<LOCAL_BLK>> -- create error with RAISE
            DECLARE
              E_CODE VARCHAR2(30); -- for error code
              E_MSG VARCHAR2(50); -- for error message
            BEGIN
              E_CODE := TO_CHAR(SQLCODE);
              E_MSG  := SQLERRM;
                IF (MOD(V_COUNT,1230000) =0)
                THEN
                RAISE INVALID_NUMBER; -- raise Error from Invail_number
                END IF;
            EXCEPTION
                WHEN INVALID_NUMBER THEN -- insert error message to ERROR_LOG
                INSERT INTO ERROR_LOG(COUNT,PROGRAM_NAME,LOG_DATE,LOG_TIME,ERR_CODE,ERR_MSG)
                            VALUES(V_COUNT,'BONUS_V1.0',TO_CHAR(SYSDATE, 'YYYY/MM/DD'),TO_CHAR(SYSTIMESTAMP, 'HH:MI:SS'), E_CODE,E_MSG);
            END LOCAL_BLK;
        V_COUNT := V_COUNT+1; -- increase count
      END LOOP; -- end loop
          INSERT INTO DATA_PROC_LOG(COUNT,PROGRAM_NAME,CURR_DATE,CURR_TIME,PROCESSING)
                  VALUES(V_COUNT,'BONUS_V1.0',TO_CHAR(SYSDATE, 'YYYY/MM/DD'),TO_CHAR(SYSTIMESTAMP, 'HH:MI:SS'),'PROCSESSING END');
      CLOSE CUR_BONUS; -- close cursor
      COMMIT; -- transaction control
EXCEPTION-- main exception
  WHEN OTHERS THEN
      DBMS_OUTPUT.PUT_LINE('ERROR CODE =>'||TO_CHAR(SQLCODE));
      DBMS_OUTPUT.PUT_LINE('ERROR MSG =>'||SQLERRM);
END MAIN_BLK;
/
-----------------------------------------------------------------------
							
------------------------						
DROP TABLE BONUS_LARGE24;
DROP TABLE DATA_PROC_LOG2;
DROP TABLE ERROR_LOG2;
------------------------

SELECT * FROM BONUS_LARGE24;	
SELECT * FROM DATA_PROC_LOG2;
SELECT * FROM ERROR_LOG2;

---------------------------------------------------------------------------------
---------------------------------------------------------------------------------
SET SERVEROUTPUT ON
<<MAIN_BLK>>
DECLARE
   CURSOR CUR_BONUS IS
      SELECT SAL, JOB, DEPTNO, EMPNO,
        CASE WHEN DEPTNO = 10 THEN SAL*0.3
             WHEN DEPTNO = 20 THEN SAL*0.1
             WHEN DEPTNO = 30 THEN SAL*0.05
             ELSE SAL*0.2
        END AS BONUS
        FROM EMP_LARGE
        WHERE JOB != 'PRESIDENT';
        V_COUNT NUMBER;
        
        TYPE CUR_TYPE IS TABLE OF CUR_BONUS%ROWTYPE; -- declare type of cursor
        CS  CUR_TYPE;      
BEGIN
      OPEN CUR_BONUS; -- open cursor
      V_COUNT := 1;
      
      INSERT INTO DATA_PROC_LOG2(COUNT,PROGRAM_NAME,CURR_DATE,CURR_TIME,PROCESSING) -- insert the begin of DATA_PROCESSING_LOGGING
              VALUES(V_COUNT,'BONUS_V1.0',TO_CHAR(SYSDATE, 'YYYY/MM/DD'),TO_CHAR(SYSTIMESTAMP, 'HH:MI:SS'),'BEGIN PROCSESSING');
      LOOP
          FETCH CUR_BONUS BULK COLLECT INTO CS LIMIT 10000; -- limit for bulk collect
          FORALL I IN 1..CS.COUNT -- used forall clause
          INSERT INTO BONUS_LARGE24(YYYYMM,EMPNO,JOB,DEPTNO,SAL,BONUS)  -- insert data to BONUS_LARGE23 table
                VALUES(TO_CHAR(SYSDATE, 'YYYYMM'),CS(I).EMPNO,CS(I).JOB,CS(I).DEPTNO,CS(I).SAL,CS(I).BONUS);
          IF  (MOD(V_COUNT,1) = 0)
          THEN
          INSERT INTO DATA_PROC_LOG2(COUNT,PROGRAM_NAME,CURR_DATE,CURR_TIME,PROCESSING)
              VALUES(V_COUNT,'BONUS_V1.0',TO_CHAR(SYSDATE, 'YYYY/MM/DD'),TO_CHAR(SYSTIMESTAMP, 'HH:MI:SS'),'PROCSESSING...');
              COMMIT;
          END IF;
             <<LOCAL_BLK>> -- create error with RAISE
            DECLARE
              E_CODE VARCHAR2(30); -- for error code
              E_MSG VARCHAR2(50); -- for error message
            BEGIN
              E_CODE := TO_CHAR(SQLCODE);
              E_MSG  := SQLERRM;
                IF (MOD(V_COUNT,100) =0)
                THEN
                RAISE INVALID_NUMBER; -- raise Error from Invail_number
                END IF;
            EXCEPTION
                WHEN INVALID_NUMBER THEN -- insert error message to ERROR_LOG
                INSERT INTO ERROR_LOG2(COUNT,PROGRAM_NAME,LOG_DATE,LOG_TIME,ERR_CODE,ERR_MSG)
                            VALUES(V_COUNT,'BONUS_V1.0',TO_CHAR(SYSDATE, 'YYYY/MM/DD'),TO_CHAR(SYSTIMESTAMP, 'HH:MI:SS'), E_CODE,E_MSG);
            COMMIT;
            END LOCAL_BLK;
        V_COUNT := V_COUNT+1;  -- increase count
        EXIT WHEN CUR_BONUS%NOTFOUND;
      END LOOP; -- end loop
          INSERT INTO DATA_PROC_LOG2(COUNT,PROGRAM_NAME,CURR_DATE,CURR_TIME,PROCESSING)
                  VALUES(V_COUNT,'BONUS_V1.0',TO_CHAR(SYSDATE, 'YYYY/MM/DD'),TO_CHAR(SYSTIMESTAMP, 'HH:MI:SS'),'PROCSESSING END');
      CLOSE CUR_BONUS; -- close cursor
      COMMIT; -- transaction control
EXCEPTION-- main exception
  WHEN OTHERS THEN
      DBMS_OUTPUT.PUT_LINE('ERROR FOUNDED2');
      DBMS_OUTPUT.PUT_LINE('ERROR CODE =>'||TO_CHAR(SQLCODE));
      DBMS_OUTPUT.PUT_LINE('ERROR MSG =>'||SQLERRM);
END MAIN_BLK;
/

