require recipes-core/images/rpi-basic-image.bb
IMAGE_INSTALL += "media"
IMAGE_INSTALL += "vsomeip"
DISTRO_FEATURES += "wifi bluez"

IMAGE_INSTALL_append = "\
     linux-firmware-rpidistro-bcm43430 \
     linux-firmware-rpidistro-bcm43455 \
     bluez-firmware-rpidistro-bcm43430a1-hcd \
     bluez-firmware-rpidistro-bcm4345c0-hcd \
     pulseaudio dbus gconf glib-2.0 \
     pulseaudio-server \
     pulseaudio-module-bluetooth-discover \
     pulseaudio-module-bluetooth-policy \
     pulseaudio-module-bluez5-device \
     pulseaudio-module-bluez5-discover \
     alsa-utils \
     alsa-plugins \
"
