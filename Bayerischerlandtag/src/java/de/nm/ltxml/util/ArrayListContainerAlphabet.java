package de.nm.ltxml.util;

import java.util.ArrayList;
import java.util.HashMap;

import de.nm.ltxml.core.Abgeordneter;

public class ArrayListContainerAlphabet
{
	private ArrayList<Abgeordneter> a = new ArrayList<>();
	private ArrayList<Abgeordneter> b = new ArrayList<>();
	private ArrayList<Abgeordneter> c = new ArrayList<>();
	private ArrayList<Abgeordneter> d = new ArrayList<>();
	private ArrayList<Abgeordneter> e = new ArrayList<>();
	private ArrayList<Abgeordneter> f = new ArrayList<>();
	private ArrayList<Abgeordneter> g = new ArrayList<>();
	private ArrayList<Abgeordneter> h = new ArrayList<>();
	private ArrayList<String> hashKeysNachname = new ArrayList<>();
	private ArrayList<String> hashKeysVorname = new ArrayList<>();
	private ArrayList<Abgeordneter> i = new ArrayList<>();
	private ArrayList<Abgeordneter> j = new ArrayList<>();
	private ArrayList<Abgeordneter> k = new ArrayList<>();
	private ArrayList<Abgeordneter> l = new ArrayList<>();
	private ArrayList<Abgeordneter> m = new ArrayList<>();
	private ArrayList<Abgeordneter> n = new ArrayList<>();
	private ArrayList<Abgeordneter> o = new ArrayList<>();
	private ArrayList<Abgeordneter> p = new ArrayList<>();
	private ArrayList<Abgeordneter> q = new ArrayList<>();
	private ArrayList<Abgeordneter> r = new ArrayList<>();
	private ArrayList<Abgeordneter> s = new ArrayList<>();
	private ArrayList<Abgeordneter> t = new ArrayList<>();
	private ArrayList<Abgeordneter> u = new ArrayList<>();
	private ArrayList<Abgeordneter> v = new ArrayList<>();
	private ArrayList<Abgeordneter> w = new ArrayList<>();
	private ArrayList<Abgeordneter> x = new ArrayList<>();
	private ArrayList<Abgeordneter> y = new ArrayList<>();
	private ArrayList<Abgeordneter> z = new ArrayList<>();

	public ArrayList<Abgeordneter> getA()
	{
		return a;
	}

	public ArrayList<Abgeordneter> getB()
	{
		return b;
	}

	public ArrayList<Abgeordneter> getC()
	{
		return c;
	}

	public ArrayList<Abgeordneter> getD()
	{
		return d;
	}

	public ArrayList<Abgeordneter> getE()
	{
		return e;
	}

	public ArrayList<Abgeordneter> getF()
	{
		return f;
	}

	public ArrayList<Abgeordneter> getG()
	{
		return g;
	}

	public ArrayList<Abgeordneter> getH()
	{
		return h;
	}

	public ArrayList<String> getHashKeysNachname()
	{
		return hashKeysNachname;
	}

	public ArrayList<String> getHashKeysVorname()
	{
		return hashKeysVorname;
	}

	public HashMap<String, ArrayList<Abgeordneter>> getHashMap()
	{
		final HashMap<String, ArrayList<Abgeordneter>> map = new HashMap<>();

		map.put("A", this.a);
		map.put("B", this.b);
		map.put("C", this.c);
		map.put("D", this.d);
		map.put("E", this.e);
		map.put("F", this.f);
		map.put("G", this.g);
		map.put("H", this.h);
		map.put("I", this.i);
		map.put("J", this.j);
		map.put("K", this.k);
		map.put("L", this.l);
		map.put("M", this.m);
		map.put("N", this.n);
		map.put("O", this.o);
		map.put("P", this.p);
		map.put("Q", this.q);
		map.put("R", this.r);
		map.put("S", this.s);
		map.put("T", this.t);
		map.put("U", this.u);
		map.put("V", this.v);
		map.put("W", this.w);
		map.put("X", this.x);
		map.put("Y", this.y);
		map.put("Z", this.z);

		return map;

	}

	public HashMap<String, Abgeordneter> getHashNachname()
	{
		hashKeysNachname = new ArrayList<>();
		final HashMap<String, Abgeordneter> map = new HashMap<>();

		for (final Abgeordneter abg : a)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}

		for (final Abgeordneter abg : b)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}

		for (final Abgeordneter abg : c)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : d)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : e)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : f)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : g)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : h)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : i)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : j)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : k)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : l)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : m)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : n)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : o)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : p)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : q)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : r)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : s)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : t)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : u)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : v)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : w)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : x)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : y)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}
		for (final Abgeordneter abg : z)
		{
			map.put(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase(), abg);
			hashKeysNachname.add(abg.getName().toUpperCase() + " " + abg.getVorname().toUpperCase());
		}

		return map;

	}

	public HashMap<String, Abgeordneter> getHashVorname()
	{
		hashKeysVorname = new ArrayList<>();
		final HashMap<String, Abgeordneter> map = new HashMap<>();

		for (final Abgeordneter abg : a)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}

		for (final Abgeordneter abg : b)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}

		for (final Abgeordneter abg : c)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : d)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : e)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : f)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : g)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : h)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : i)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : j)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : k)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : l)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : m)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : n)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : o)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : p)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : q)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : r)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : s)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : t)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : u)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : v)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : w)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : x)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : y)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}
		for (final Abgeordneter abg : z)
		{
			map.put(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase(), abg);
			hashKeysVorname.add(abg.getVorname().toUpperCase() + " " + abg.getName().toUpperCase());
		}

		return map;

	}

	public ArrayList<Abgeordneter> getI()
	{
		return i;
	}

	public ArrayList<Abgeordneter> getJ()
	{
		return j;
	}

	public ArrayList<Abgeordneter> getK()
	{
		return k;
	}

	public ArrayList<Abgeordneter> getL()
	{
		return l;
	}

	public ArrayList<Abgeordneter> getM()
	{
		return m;
	}

	public ArrayList<Abgeordneter> getN()
	{
		return n;
	}

	public ArrayList<Abgeordneter> getO()
	{
		return o;
	}

	public ArrayList<Abgeordneter> getP()
	{
		return p;
	}

	public ArrayList<Abgeordneter> getQ()
	{
		return q;
	}

	public ArrayList<Abgeordneter> getR()
	{
		return r;
	}

	public ArrayList<Abgeordneter> getS()
	{
		return s;
	}

	public ArrayList<Abgeordneter> getT()
	{
		return t;
	}

	public ArrayList<Abgeordneter> getU()
	{
		return u;
	}

	public ArrayList<Abgeordneter> getV()
	{
		return v;
	}

	public ArrayList<Abgeordneter> getW()
	{
		return w;
	}

	public ArrayList<Abgeordneter> getX()
	{
		return x;
	}

	public ArrayList<Abgeordneter> getY()
	{
		return y;
	}

	public ArrayList<Abgeordneter> getZ()
	{
		return z;
	}

	public void setA(final ArrayList<Abgeordneter> a)
	{
		this.a = a;
	}

	public void setB(final ArrayList<Abgeordneter> b)
	{
		this.b = b;
	}

	public void setC(final ArrayList<Abgeordneter> c)
	{
		this.c = c;
	}

	public void setD(final ArrayList<Abgeordneter> d)
	{
		this.d = d;
	}

	public void setE(final ArrayList<Abgeordneter> e)
	{
		this.e = e;
	}

	public void setF(final ArrayList<Abgeordneter> f)
	{
		this.f = f;
	}

	public void setG(final ArrayList<Abgeordneter> g)
	{
		this.g = g;
	}

	public void setH(final ArrayList<Abgeordneter> h)
	{
		this.h = h;
	}

	public void setI(final ArrayList<Abgeordneter> i)
	{
		this.i = i;
	}

	public void setJ(final ArrayList<Abgeordneter> j)
	{
		this.j = j;
	}

	public void setK(final ArrayList<Abgeordneter> k)
	{
		this.k = k;
	}

	public void setL(final ArrayList<Abgeordneter> l)
	{
		this.l = l;
	}

	public void setM(final ArrayList<Abgeordneter> m)
	{
		this.m = m;
	}

	public void setN(final ArrayList<Abgeordneter> n)
	{
		this.n = n;
	}

	public void setO(final ArrayList<Abgeordneter> o)
	{
		this.o = o;
	}

	public void setP(final ArrayList<Abgeordneter> p)
	{
		this.p = p;
	}

	public void setQ(final ArrayList<Abgeordneter> q)
	{
		this.q = q;
	}

	public void setR(final ArrayList<Abgeordneter> r)
	{
		this.r = r;
	}

	public void setS(final ArrayList<Abgeordneter> s)
	{
		this.s = s;
	}

	public void setT(final ArrayList<Abgeordneter> t)
	{
		this.t = t;
	}

	public void setU(final ArrayList<Abgeordneter> u)
	{
		this.u = u;
	}

	public void setV(final ArrayList<Abgeordneter> v)
	{
		this.v = v;
	}

	public void setW(final ArrayList<Abgeordneter> w)
	{
		this.w = w;
	}

	public void setX(final ArrayList<Abgeordneter> x)
	{
		this.x = x;
	}

	public void setY(final ArrayList<Abgeordneter> y)
	{
		this.y = y;
	}

	public void setZ(final ArrayList<Abgeordneter> z)
	{
		this.z = z;
	}

	public int size()
	{
		int i = 0;

		i = i + a.size();
		i = i + b.size();
		i = i + c.size();
		i = i + d.size();
		i = i + e.size();
		i = i + f.size();
		i = i + g.size();
		i = i + h.size();
		i = i + this.i.size();
		i = i + j.size();
		i = i + k.size();
		i = i + l.size();
		i = i + m.size();
		i = i + n.size();
		i = i + o.size();
		i = i + p.size();
		i = i + q.size();
		i = i + r.size();
		i = i + s.size();
		i = i + t.size();
		i = i + u.size();
		i = i + v.size();
		i = i + w.size();
		i = i + x.size();
		i = i + y.size();
		i = i + z.size();

		return i;
	}

}
