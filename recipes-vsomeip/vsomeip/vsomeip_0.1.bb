LICENSE="CLOSED"

SRC_URI = "git://github.com/COVESA/vsomeip.git;protocol=http;branch=master"

 

SRCREV = "13f9c89ced6ffaeb1faf485152e27e1f40d234cd"


DEPENDS ="boost boost-build-native dlt-daemon "


inherit cmake

S = "${WORKDIR}/git"
 
inherit cmake lib_package gitpkgv

PACKAGES_remove += "${PN}-bin"
FILES_${PN} += "${bindir}/vsomeipd ${sysconfdir}/${BPN}"
FILES_${PN}-dev += "${libdir}/cmake"

BBCLASSEXTEND = "nativesdk"

do_install_append() {
    mv ${D}/usr/etc ${D}
}









