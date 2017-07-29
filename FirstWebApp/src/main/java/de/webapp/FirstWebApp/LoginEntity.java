package de.webapp.FirstWebApp;

public class LoginEntity
{
	
	
	private String name;
	private String password;
	private String fName = "Odmar";
	private String fPassword = "123";
	
	
	public LoginEntity()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LoginEntity(String name, String password)
	{
		super();
		this.name = name;
		this.password = password;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getfName()
	{
		return fName;
	}

	public void setfName(String fName)
	{
		this.fName = fName;
	}

	public String getfPassword()
	{
		return fPassword;
	}

	public void setfPassword(String fPassword)
	{
		this.fPassword = fPassword;
	}

}
