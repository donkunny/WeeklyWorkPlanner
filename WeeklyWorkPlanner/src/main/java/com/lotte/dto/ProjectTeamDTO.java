/**
 * ProjectTeamDTO 객체
 * @author 박소은 
 * @Date 170331
 */
package com.lotte.dto;

public class ProjectTeamDTO {
	private int ptIndex; //팀인덱스
	private int pIndex; //프로젝트코드
	private int eIndex; //사원코드
	
	public int getPtIndex() {
		return ptIndex;
	}
	public void setPtIndex(int ptIndex) {
		this.ptIndex = ptIndex;
	}
	public int getpIndex() {
		return pIndex;
	}
	public void setpIndex(int pIndex) {
		this.pIndex = pIndex;
	}
	public int geteIndex() {
		return eIndex;
	}
	public void seteIndex(int eIndex) {
		this.eIndex = eIndex;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectTeam [ptIndex=");
		builder.append(ptIndex);
		builder.append(", pIndex=");
		builder.append(pIndex);
		builder.append(", eIndex=");
		builder.append(eIndex);
		builder.append("]");
		return builder.toString();
	}
	
	
}
