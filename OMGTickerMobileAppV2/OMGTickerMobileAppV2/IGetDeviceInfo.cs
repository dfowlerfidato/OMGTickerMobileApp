﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OMGTickerMobileAppV2
{
    public interface IGetDeviceInfo
    {
        string GetDeviceInfo();
    }

    public interface IIPAddressManager
    {
        string GetIPAddress();
    }
}
