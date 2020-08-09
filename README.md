# Spring Cloud Config clinet 샘플
MSA에서 중앙 config서버를 사용하는 샘플 프로젝트

#사용 예

1. 요청 URL 샘플
 - http://localhost:15995/message
 - http://localhost:15995/name

2. 갱신 샘플(HTTP POST로 요청해야 함)
  - http://localhost:15995/system/actuator/refresh
  
3. 설정 저장 git 주소
 - https://github.com/oshnew/msa-cofig-server-study-repo/blob/master/app-1-default.yml