
package meetup;

import java.util.*;

// import com.thoughtworks.xstream.annotations.XStreamAlias;
// import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 *  
 *   Activity
 *
 */
public class Activity
{
	private String id;
	private String itemType;
	private String title;
	private String link;
	private String photoUrl;
	private String groupId;
	private String groupName;
	private String memberName;
	private String memberId;
	private Calendar published;
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getItemType()
	{
		return itemType;
	}
	public void setItemType(String itemType)
	{
		this.itemType = itemType;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getLink()
	{
		return link;
	}
	public void setLink(String link)
	{
		this.link = link;
	}
	public String getPhotoUrl()
	{
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl)
	{
		this.photoUrl = photoUrl;
	}
	public String getGroupId()
	{
		return groupId;
	}
	public void setGroupId(String groupId)
	{
		this.groupId = groupId;
	}
	public String getGroupName()
	{
		return groupName;
	}
	public void setGroupName(String groupName)
	{
		this.groupName = groupName;
	}
	public String getMemberName()
	{
		return memberName;
	}
	public void setMemberName(String memberName)
	{
		this.memberName = memberName;
	}
	
	public String getMemberId()
	{
		return memberId;
	}
	
	public void setMemberId(String memberId)
	{
		this.memberId = memberId;
	}
	
	public Calendar getPublished()
	{
		return published;
	}
	
	public void setPublished(Calendar published)
	{
		this.published = published;
	}
	
	
}
