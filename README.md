# cloud-backend

## Lv0. AWS Budget 설정
- AWS Budgets 설정
  - 예산은 100$, 예산의 80% 달성 시 이메일이 오도록 설정했습니다.
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
<img width="1725" height="857" alt="image" src="https://github.com/user-attachments/assets/3d030782-dd37-4a31-a79a-95c0886837b3" />


- RDS 보안 그룹 스크린샷
<img width="1917" height="897" alt="image" src="https://github.com/user-attachments/assets/9f878a1b-a099-47a4-a86f-a4ca4147e3a5" />


## Lv3 - 프로필 사진 기능 추가와 권한 관리
- URL : https://member-api-profile-images-cmj011112.s3.ap-northeast-2.amazonaws.com/profile-images/1/5483151c-6053-4377-b99a-f4be80a85aa3-test.jpg?X-Amz-Security-Token=IQoJb3JpZ2luX2VjECIaDmFwLW5vcnRoZWFzdC0yIkYwRAIgNDvf%2FbgNMPD7iYcopQWiiOiwPZ6YaJcubqH%2FxIyHzqkCIBCS2yl3wkB9K93fz8cDq29%2Fe7jS%2B%2BzTurjQxrFsU5E%2BKtIFCOv%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQABoMNjI3NTgxNjIwNzk5IgwRIs%2B%2B%2BdNxllvDpnMqpgXjkT4UIBA1SsXmYwI0wmTXiPfELHCG5FWfVwxh1zfHl%2FyEG8Grhiog8PGvd34uP5CYWr3%2FVwzFDl2StOf5qh9DRWmA%2BFapR7bQXiKRyRIwiDUsCmtHY5AEyo5ULcI5%2BbRwhIbzgTxsICWXryLe8QwyHm4B3Aq%2FjMKEs2EJbi0qXJn31DSmtkqbsUjTR%2FdB5096hkd7WUvpjRpn%2Ft9%2BTdocjy5Edm8LYnB5J8lHH8%2BoIAJJ6M56jtHyhlr5%2Bov4HhM0wReoPWO3CRhVhfcVoNFskZzH7pRR8U6fjbG1LVPFluch728JbTxJv3xHp3DJtTFW80UHignhMsKZHdei0rZjrawyf%2FuhLmieIS7n%2Fh%2FP9xXJ89F465Kga5eJnQ%2BxhSuhn0mR27vn8hiNs0wx3MjIdqrbyhXlmhbnqwlBVanb82p6zA0Gjg94wshShdAD8lbPHKM5oFYdqMBr4Uov91qkHvr8xptBa4E4P84%2FSQDbCsahJuE%2BNW6BeYOYeQrqLd%2Bu%2BrR21d1W24u299iWqEtgjGJRlNrOH1Yyj5m%2F9keddZp0M%2FCv1Na0xdWVBQRsWY3SPVlEbf8Rj%2B2ub05Ovtf0wo9WaE1WovHQlJmNR9jsm%2BMikJD4wBp%2F7HFTum%2FPhuXt4%2FX6Ztij%2Fs8bCyYq%2F4h3sNLUtEOULFuxVVnltRkkzhsIISMDg%2FN2Qdp6A6iCJxaeTXmt7xEZSl4uhtFr8WrvzmGIIY85yMe9d%2FyQDNYuayYPuRE71nnpJcyeZyboO6u2RTKcCggLudNTVFfzT0rb0dQoQjU79EGtygFB6n2BcwWUhvK8ODT0Ld0k6P1qS2c9L8JBi%2F2mdi52rILaE4pVwaT2ylcvNm%2FyXvY4qsLx%2BP7wB8qKCN6svHjGO8CObfY3sn7FVRowtIS20AY6sgE8nCTAoqbCSUYf0RdsehsxuI%2BnEys%2F6UytCH5FG6LSwEbKCxJIt%2Ft9xhvgvsLBNgFizSavAUsR%2BgXQXdPGJbWrhFvItjmIFNXIKHZgffQTy5zX2lU1%2F1U3ygdZEFnniDH8qA6ylHeu7wd4fjwpATvPF4C7YmjY293R5czAOu7e6djGLPlVpZ5nB%2BdumxpZpEZ5TwUy1Zb1UxXGcLV6RvowvCqLgNuFO0zWdKUhC%2Fww9bOl&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20260520T094911Z&X-Amz-SignedHeaders=host&X-Amz-Credential=ASIAZEHWHSI7XS3MUSWR%2F20260520%2Fap-northeast-2%2Fs3%2Faws4_request&X-Amz-Expires=604800&X-Amz-Signature=67cae4cafe6b52771c845a574c231ab3c3071aee99db1175223035f87f6af9ae
- URL 유효 기간 설정 : 7일
- URL 만료 기간 : 2026-05-27 오후 6:49:11 (KST)
<img width="1918" height="958" alt="image" src="https://github.com/user-attachments/assets/efe1a104-8742-404f-9b40-bec99be96f46" />



## Lv4 - Docker & CI/CD 파이프라인 구축 
- Github Actions 성공 이미지
<img width="1690" height="848" alt="image" src="https://github.com/user-attachments/assets/900c170e-f012-428f-8443-a83ddf5d84d7" />


- EC2 터미널 이미지(sudo docker ps)
<img width="948" height="157" alt="image" src="https://github.com/user-attachments/assets/0ea2247d-98ba-4e28-b2aa-4d9bb8f275c4" />


## Lv5 -  고가용성 아키텍처와 보안 도메인 연결 (ALB + ASG + HTTPS) 
- HTTPS 적용된 도메인 URL(https://minjae-member-api.click/actuator/health)
<img width="1912" height="972" alt="image" src="https://github.com/user-attachments/assets/1d36cc20-5b60-4f82-a3d2-1c9298dac853" />

- Target Group(대상 그룹) 이미지
<img width="1918" height="961" alt="image" src="https://github.com/user-attachments/assets/b5b00930-adf0-4492-a2ae-f72056e3fb78" />


## Lv6. 글로벌 성능 최적화 (CloudFront CDN)
- CloudFront 이미지 URL
<img width="1915" height="970" alt="image" src="https://github.com/user-attachments/assets/9ebc5bde-e2b7-406a-9318-bca3bd453f34" />

