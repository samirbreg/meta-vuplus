SRCDATE = "20170905"
SRCDATE_PR = "r1"

DEPENDS = "libgles-${MACHINE}"

SRC_URI = "http://archive.vuplus.com/download/build_support/vuplus/libvugles2-0.1.1-${PR}.tar.gz file://LICENSE-CLOSE"

SRC_URI[md5sum] = "63b2b25f4b11cd8151592302cabd375e"
SRC_URI[sha256sum] = "569b73ba3a6355b2d0c6723f76b93b4845f64309e5930f5f23c6ad5c9da8a418"

require libvugles2.inc

COMPATIBLE_MACHINE = "^(vusolo2)$"
