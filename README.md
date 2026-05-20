# cloud-backend

## Lv0. AWS Budget 설정
<img width="1918" height="900" alt="image" src="https://github.com/user-attachments/assets/040ada07-5252-4086-8bbb-40722fee4035" />

## LV 1 - 네트워크 구축 및 핵심 기능 배포

### 인프라 구성

- VPC 생성
- Public Subnet / Private Subnet 분리
- Public Subnet에 EC2 생성
- 보안그룹 인바운드 규칙
  - SSH: 22
  - Application: 8080

### EC2 Public IP
- 13.124.99.218

## Lv 2 - DB 분리 및 보안 연결하기

- Actuator Info 엔드포인트 URL
<img width="1918" height="1008" alt="image" src="https://github.com/user-attachments/assets/9461467a-6bad-4f00-8261-5604907529d9" />

- RDS 보안 그룹 스크린샷
<img width="1917" height="897" alt="image" src="https://github.com/user-attachments/assets/9f878a1b-a099-47a4-a86f-a4ca4147e3a5" />


## Lv4 - Docker & CI/CD 파이프라인 구축 
- Github Actions 성공 이미지
<img width="1690" height="848" alt="image" src="https://github.com/user-attachments/assets/900c170e-f012-428f-8443-a83ddf5d84d7" />


- EC2 터미널 이미지(sudo docker ps)
<img width="948" height="157" alt="image" src="https://github.com/user-attachments/assets/0ea2247d-98ba-4e28-b2aa-4d9bb8f275c4" />


##Lv5 -  고가용성 아키텍처와 보안 도메인 연결 (ALB + ASG + HTTPS) 
- HTTPS 적용된 도메인 URL(https://minjae-member-api.click/actuator/health)
<img width="1912" height="972" alt="image" src="https://github.com/user-attachments/assets/1d36cc20-5b60-4f82-a3d2-1c9298dac853" />

- Target Group(대상 그룹) 이미지
<img width="1918" height="961" alt="image" src="https://github.com/user-attachments/assets/b5b00930-adf0-4492-a2ae-f72056e3fb78" />



