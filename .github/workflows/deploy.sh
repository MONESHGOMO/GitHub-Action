#!/bin/bash
set -e

echo "🚀 Triggering Render deployment..."
curl -X POST "${RENDER_DEPLOY_HOOK}"
echo "✅ Render deployment triggered successfully!"

echo "⏳ Waiting for app to become available..."
sleep 30   # wait a bit for Render to spin up the new container

echo "📡 Calling Spring Boot API endpoint..."
curl -s "https://dev-16.onrender.com/"

echo ""
echo "✅ API call completed!"
