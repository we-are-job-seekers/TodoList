# 🏰 FrienDo 웹 사이트

한남대학교 졸업생끼리 개발한 프로젝트입니다. Todo 서비스를 기획하고 사용자가 직접 Todo를 만들어 카카오톡 메시지로 알림을 주는 서비스를 설계 및 구축했습니다. 주요 기능으로는 회원 관리 및 멤버십, Todo 관리 및 알림, 게시판, 채팅 기능이 있습니다.

<br>

[**💻 FrienDo 웹 사이트 바로가기**](???????)

<br>

## 📌 프로젝트 개요

- **프로젝트 기간:** 2024.11.07 ~ 2024.??.??
- **주요 목표와 하위 목표**
  - 회원 관리 및 멤버십 기능 구현
    - 회원 가입, 로그인, 아이디 찾기, 비밀번호 재설정, 아이디 기억하기 기능 구현
    - 결제 유무에 따라 역할을 부여하고 혜택을 제공하는 멤버십 기능 구현
  - Todo 관리 기능 구현
    - Todo CRUD 및 검색 기능 구현
    - Todo 일정에 따라 카카오톡 알림 발송 기능 구현
  - 게시판 기능 구현
    - 게시글 CRUD 및 검색 기능 구현
    - 댓글 CRUD 기능 구현
  - 채팅 기능 구현
    - 웹 소켓을 사용하여 로그인 한 회원과 관리자 간 실시간 채팅 기능 구현

<br>

## 😎 조원 소개

<table>
  <tr>
    <th colspan="2" align="center">프로필</th>
    <th align="center">역할</th>
    <th align="center">작업 영역</th>
  </tr>
  <tr>
    <td align="center"><img src="https://avatars.githubusercontent.com/u/62269067?v=4" width="70"></td>
    <td>이동규(<a href="https://github.com/LEE-Donggyu" target="_blank">@LEE-Donggyu</a>)<br>Backend</td>
    <td align="center">팀장</td>
    <td>Backend</td>
  </tr>
  <tr>
    <td align="center"><img src="https://avatars.githubusercontent.com/u/62374847?v=4" width="70"></td>
    <td>임성진(<a href="https://github.com/LIMSONGJIN" target="_blank">@LIMSONGJIN</a>)<br>Frontend</td>
    <td align="center">팀원</td>
    <td>Frontend</td>
  </tr>
</table>

<br>

## 💻 사용한 기술

### Front-End

<img src="https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=black"> <img src="https://img.shields.io/badge/redux-764ABC?style=for-the-badge&logo=redux&logoColor=white"> <img src="https://img.shields.io/badge/typescript-3178C6?style=for-the-badge&logo=typescript&logoColor=white"> <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white">

### Back-End

<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">

### DB

<img src="https://img.shields.io/badge/mariadb-003545?style=for-the-badge&logo=mariadb&logoColor=white"> <img src="https://img.shields.io/badge/h2-0000bb?style=for-the-badge&logo=h2&logoColor=white">

### ETC

<img src="https://img.shields.io/badge/discord-5865F2?style=for-the-badge&logo=discord&logoColor=white"> <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/gitbook-3884FF?style=for-the-badge&logo=gitbook&logoColor=white"> <img src="https://img.shields.io/badge/googlesheets-34A853?style=for-the-badge&logo=googlesheets&logoColor=white">

<br>

## ✍🏻 Architecture

![구름호텔아키텍처](https://github.com/goorm-fullstack/GoormHotel/assets/121299334/4e735943-4dc6-4c1c-99ad-8ea078223232)

<br>

## 📁 Repository 구조

<table style="width: 100% !important;">
<tr>
<th align="center">
<img width="384" height="1">
<p>Front-End</p>
</th>
<th align="center">
<img width="384" height="1">
<p>Back-End</p>
</th>
</tr>
<tr>
<td valign="top">

```
FRONTEND
├─node_modules
├─public
└─src
  ├─admin
  │ ├─board
  │ ├─chat
  │ ├─common
  │ ├─Home
  │ ├─item
  │ ├─login
  │ ├─member
  │ └─reservation
  ├─components
  │ ├─AddItemForm
  │ ├─Agreement
  │ ├─common
  │ │  ├─DateButton
  │ │  ├─Paging
  │ │  ├─Search
  │ │  └─TextEditor
  │ ├─Coupon
  │ ├─Item
  │ ├─layout
  │ │  ├─ChatModal
  │ │  ├─Footer
  │ │  ├─Header
  │ │  └─SubHeader
  │ ├─Reservation
  │ └─Slide
  ├─images
  ├─pages
  │ ├─about
  │ │ ├─About
  │ │ ├─Facilities
  │ │ ├─Location
  │ │ ├─Membership
  │ │ └─Sitemap
  │ ├─agreement
  │ ├─board
  │ ├─Home
  │ ├─member
  │ └─reservation
  ├─Style
  └─utils
      ├─adaptor
      ├─api
      ├─chat
      └─function
```

</td>
<td>

```
BACKEND
├─bin
...
└─src
  ├─main
  │ ├─generated
  │ ├─java
  │ │ └─goormknights
  │ │   └─hotel
  │ │     ├─auth
  │ │     │ ├─config
  │ │     │ ├─controller
  │ │     │ ├─dto
  │ │     │ └─service
  │ │     ├─board
  │ │     │ ├─controller
  │ │     │ ├─dto
  │ │     │ ├─exception
  │ │     │ ├─model
  │ │     │ ├─repository
  │ │     │ └─service
  │ │     ├─chat
  │ │     │ ├─config
  │ │     │ ├─controller
  │ │     │ ├─dto
  │ │     │ ├─model
  │ │     │ ├─repository
  │ │     │ └─service
  │ │     ├─coupon
  │ │     │ ├─controller
  │ │     │ ├─dto
  │ │     │ ├─exception
  │ │     │ ├─model
  │ │     │ ├─repository
  │ │     │ └─service
  │ │     ├─email
  │ │     │ ├─controller
  │ │     │ ├─dto
  │ │     │ ├─exception
  │ │     │ ├─model
  │ │     │ ├─repository
  │ │     │ └─service
  │ │     ├─giftcard
  │ │     │ ├─controller
  │ │     │ ├─dto
  │ │     │ ├─exception
  │ │     │ ├─model
  │ │     │ ├─repository
  │ │     │ └─service
  │ │     ├─global
  │ │     │ ├─config
  │ │     │ ├─controller
  │ │     │ ├─dto
  │ │     │ ├─entity
  │ │     │ ├─event
  │ │     │ ├─exception
  │ │     │ └─schedule
  │ │     ├─item
  │ │     │ ├─controller
  │ │     │ ├─dto
  │ │     │ ├─exception
  │ │     │ ├─model
  │ │     │ ├─repository
  │ │     │ └─service
  │ │     ├─member
  │ │     │ ├─controller
  │ │     │ ├─dto
  │ │     │ ├─exception
  │ │     │ ├─model
  │ │     │ ├─repository
  │ │     │ └─service
  │ │     ├─reply
  │ │     │ ├─controller
  │ │     │ ├─dto
  │ │     │ ├─exception
  │ │     │ ├─model
  │ │     │ ├─repository
  │ │     │ └─service
  │ │     ├─report
  │ │     │ ├─Controller
  │ │     │ ├─dto
  │ │     │ ├─exception
  │ │     │ ├─model
  │ │     │ ├─repository
  │ │     │ └─Service
  │ │     ├─reservation
  │ │     │ ├─controller
  │ │     │ ├─dto
  │ │     │ ├─exception
  │ │     │ ├─model
  │ │     │ ├─repository
  │ │     │ └─service
  │ │     └─subscribe
  │ │       ├─controller
  │ │       ├─dto
  │ │       ├─model
  │ │       ├─repository
  │ │       └─service
  │ └─resources
  └─test
```

</td>
</tr>
</table>

<br>

## 💾 ERD

![TodoList](https://github.com/user-attachments/assets/c9a1c4df-0212-4f62-88e2-43d46692904c)

<br>

## 📌 더보기

- [패키지(디렉터리) 구조 변경](https://github.com/goorm-fullstack/GoormHotel/issues/26)
