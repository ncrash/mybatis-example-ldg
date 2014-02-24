mybatis-example
===============


책 스터디 : 마이바티스 프로그래밍 [JDBC를 대체하는 쉽고 빠른 자바 데이터베이스 프레임워크]

source code fork from : http://mybatis-example.googlecode.com/svn/trunk/

## 목적
* github에서 소스코드 리뷰이력 생성
* IDE에 관계없이 동작하도록 변경
 * 빌드자동화 도구를 maven -> gradle 변경

## fork history

* svn checkout to git
 * ```svn2git -v http://mybatis-example.googlecode.com/svn/trunk/ --trunk / --nobranches --notags```
* git push
 * ```git remote add origin https://github.com/ncrash/mybatis-example.git```
 * ```git push -u origin master```

## reference

* https://help.github.com/articles/importing-from-subversion
* https://github.com/nirvdrum/svn2git
* https://github.com/nirvdrum/svn2git/issues/144
