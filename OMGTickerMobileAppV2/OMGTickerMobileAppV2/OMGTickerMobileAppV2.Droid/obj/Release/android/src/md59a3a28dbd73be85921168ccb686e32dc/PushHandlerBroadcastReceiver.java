package md59a3a28dbd73be85921168ccb686e32dc;


public class PushHandlerBroadcastReceiver
	extends md5214eafb7e7b3b7fcc363a68a6358563f.GcmBroadcastReceiverBase_1
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("OMGTickerMobileApp.Droid.PushHandlerBroadcastReceiver, OMGTickerMobileAppV2.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", PushHandlerBroadcastReceiver.class, __md_methods);
	}


	public PushHandlerBroadcastReceiver () throws java.lang.Throwable
	{
		super ();
		if (getClass () == PushHandlerBroadcastReceiver.class)
			mono.android.TypeManager.Activate ("OMGTickerMobileApp.Droid.PushHandlerBroadcastReceiver, OMGTickerMobileAppV2.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
