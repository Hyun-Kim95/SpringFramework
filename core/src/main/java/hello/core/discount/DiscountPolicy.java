package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

	// ���� ��� �ݾ� ����
	int discount(Member member, int price);
}
