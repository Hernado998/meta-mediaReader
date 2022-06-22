DESCRIPTION = ""
LICENSE = "CLOSED"

PR ="n01"

SRC_URI += "git://git@gitlab.abinsula.com/abinsula-rd/some-ip/mediaplayer.git;protocol=ssh;user=git;branch=master"


SRCREV = "10f5254de90b63e237d0c1be6a96a6276d051f33"


S = "${WORKDIR}/git"


DEPENDS+=" openssl vsomeip gstreamer1.0 gstreamer1.0-plugins-ugly gstreamer1.0-omx gstreamer1.0-libav gstreamer1.0-plugins-good gstreamer1.0-vaapi"

     

inherit pkgconfig cmake 



 
do_install(){
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/build/media_reader ${D}${bindir}
     
}

 

FILES_${PN} = "/usr/bin/*"
